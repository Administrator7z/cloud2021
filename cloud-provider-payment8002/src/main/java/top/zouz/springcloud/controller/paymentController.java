package top.zouz.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.zouz.springcloud.entities.CommonResult;
import top.zouz.springcloud.entities.Payment;
import top.zouz.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: zdy
 * @Date: 2021/5/12 14:21
 */
@RestController
public class paymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);

        if (result > 0) {
            return new CommonResult(200, "成功" + serverPort, result);
        } else {
            return new CommonResult(404, "失败", null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:  " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
        }
    }
}

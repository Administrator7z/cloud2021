package top.zouz.springcloud.service.impl;

import org.springframework.stereotype.Service;
import top.zouz.springcloud.dao.PaymentDao;
import top.zouz.springcloud.entities.Payment;
import top.zouz.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: zdy
 * @Date: 2021/5/12 13:58
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

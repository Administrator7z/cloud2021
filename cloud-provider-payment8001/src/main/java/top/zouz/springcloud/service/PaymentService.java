package top.zouz.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import top.zouz.springcloud.entities.Payment;

/**
 * @Author: zdy
 * @Date: 2021/5/12 13:39
 */
public interface PaymentService {
    /**
     * 写操作
     */
    int create(Payment payment);
    /**
     * 读操作
     */
    Payment getPaymentById(@Param("id") Long id);

}

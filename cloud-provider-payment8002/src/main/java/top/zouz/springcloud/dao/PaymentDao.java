package top.zouz.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zouz.springcloud.entities.Payment;

/**
 * @Author: zdy
 * @Date: 2021/5/12 13:19
 */
@Mapper
public interface PaymentDao {
    /**
     * 写操作
     */
    int create(Payment payment);
    /**
     * 读操作
     */
    Payment getPaymentById(@Param("id") Long id);
}

package com.springcloud1.service.imp;

import com.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.springcloud1.dao.PaymentDao;
import com.springcloud1.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author Yanx
 * @Create 2022-07-07-0:48
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

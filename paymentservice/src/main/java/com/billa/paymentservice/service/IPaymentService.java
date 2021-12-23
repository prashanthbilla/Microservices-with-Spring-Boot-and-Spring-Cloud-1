package com.billa.paymentservice.service;

import com.billa.paymentservice.entity.Payment;

public interface IPaymentService {

    Payment doPayment(Payment payment);

    Payment findByOrderId(int orderId);
}

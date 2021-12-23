package com.billa.paymentservice.service;

import com.billa.paymentservice.entity.Payment;
import com.billa.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService implements IPaymentService{

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    @Override
    public Payment findByOrderId(int orderId) {
        return paymentRepository.findByOrderId(orderId);
    }

    public String paymentProcessing(){
        //Here we add 3rd party api's for payment in real time
        return new Random().nextBoolean()?"Successful":"Unsuccessful";
    }
}

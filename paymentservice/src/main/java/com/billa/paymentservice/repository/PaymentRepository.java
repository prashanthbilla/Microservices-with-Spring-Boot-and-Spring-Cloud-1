package com.billa.paymentservice.repository;

import com.billa.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    Payment findByOrderId(int orderId);
}

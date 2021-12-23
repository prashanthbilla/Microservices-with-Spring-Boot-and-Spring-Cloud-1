package com.billa.paymentservice.controller;

import com.billa.paymentservice.entity.Payment;
import com.billa.paymentservice.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    IPaymentService iPaymentService;

    @PostMapping("/do")
    public Payment doPayment(@RequestBody Payment payment){
        return iPaymentService.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment getPayment(@PathVariable int orderId){
        return iPaymentService.findByOrderId(orderId);
    }
}

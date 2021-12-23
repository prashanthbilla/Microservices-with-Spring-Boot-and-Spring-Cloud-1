package com.billa.controller;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    /*private static final String USER_SERVICE="orderService";

    @RequestMapping("/order")
    @CircuitBreaker(name = USER_SERVICE, fallbackMethod = "messageOrder")
    public Exception message(Exception e){
        return e;
    }
    @RequestMapping("/payment")
    public String message2(){
        return "Payment Service is down";
    }*/
}

package com.billa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewaycloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaycloudApplication.class, args);
	}

}

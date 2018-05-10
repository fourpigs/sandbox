package com.example.uh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@RestController
public class UhApplication {

	@Autowired
	UhService uhService;

	@RequestMapping("/")
	String uh() {
		return uhService.uh();
	}

	public static void main(String[] args) {
		SpringApplication.run(UhApplication.class, args);
	}

}

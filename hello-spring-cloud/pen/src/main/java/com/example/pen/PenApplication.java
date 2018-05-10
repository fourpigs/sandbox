package com.example.pen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class PenApplication {

	@RequestMapping("/")
	String pen() {
		return "pen";
	}

	public static void main(String[] args) {
		SpringApplication.run(PenApplication.class, args);
	}
}

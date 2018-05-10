package com.example.apple;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class AppleApplication {

	private static final UUID id = UUID.randomUUID();

	@RequestMapping("/")
	String apple() {
		return "apple @" + id;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppleApplication.class, args);
	}
}

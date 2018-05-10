package com.example.uh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UhService {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "uhhun")
	public String uh() {
		return restTemplate.getForObject("http://apple", String.class) + " "
				+ restTemplate.getForObject("http://pen", String.class);

	}

	public String uhhun() {
		return "Sorry ,not available now.";
	}

}

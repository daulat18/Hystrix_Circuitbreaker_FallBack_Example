package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class SpringBootEurekaHystrixCircuitbreakerFallBackMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaHystrixCircuitbreakerFallBackMethodApplication.class, args);
	}
}

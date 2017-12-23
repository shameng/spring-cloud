package com.meng.hellofeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HelloFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloFeignApplication.class, args);
	}
}

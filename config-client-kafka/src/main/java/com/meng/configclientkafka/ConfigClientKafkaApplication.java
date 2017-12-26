package com.meng.configclientkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClientKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientKafkaApplication.class, args);
	}
}

package com.dio.design_patterns_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesignPatternsLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsLabApplication.class, args);
	}

}

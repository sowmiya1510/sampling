package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.data")
public class SamplingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplingApplication.class, args);
	}

}

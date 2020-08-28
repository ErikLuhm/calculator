package com.luhm.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
	int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}

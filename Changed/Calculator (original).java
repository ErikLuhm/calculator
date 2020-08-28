package com.luhm.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public static void main(String[] args) {
		SpringApplication.run(Calculator.class, args);
	}
	
	int sum(int a, int b) {
		return a + b;
	}

}


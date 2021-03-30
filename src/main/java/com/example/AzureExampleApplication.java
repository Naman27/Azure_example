package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureExampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello, World. This is a URL Status checker.");
		SpringApplication.run(AzureExampleApplication.class, args);
	}

}

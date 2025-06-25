package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		System.out.println("Spring App Stated");
		
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("Spring App Ended");
	}

}

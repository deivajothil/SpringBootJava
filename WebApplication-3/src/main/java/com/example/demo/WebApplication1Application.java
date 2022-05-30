package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication1Application {

	public static void main(String[] args) {
		System.out.println("calling main method.......");
		SpringApplication.run(WebApplication1Application.class, args);
	}

}

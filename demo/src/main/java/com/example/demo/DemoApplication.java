package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(DemoApplication.class, args);
		//Jio sim = new Jio();
		//sim.provide_internet();
		Jio sim = context.getBean(Jio.class);
		sim.provide_internet();
		
		//Jio sim1 = context.getBean(Jio.class);
		//sim1.provide_internet();
		
	}

}

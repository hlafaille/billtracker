package com.kerosenelabs.billtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin()
@SpringBootApplication
public class BilltrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BilltrackerApplication.class, args);
	}

}

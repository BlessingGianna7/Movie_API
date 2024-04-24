package com.example.fullapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FullAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullAppApplication.class, args);
	}


}

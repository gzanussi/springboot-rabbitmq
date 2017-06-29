package com.microwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.microwebservice.controllers", "com.microwebservice.services"})
public class BankRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankRestApplication.class, args);
	}
}

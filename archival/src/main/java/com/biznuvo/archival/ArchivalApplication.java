package com.biznuvo.archival;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ArchivalApplication {

	public static void main(String[] args) {
		System.out.println("Starting spring boot app");
		SpringApplication.run(ArchivalApplication.class, args);
	}

}

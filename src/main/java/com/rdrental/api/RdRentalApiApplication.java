package com.rdrental.api;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication 
public class RdRentalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdRentalApiApplication.class, args);
	}
	

}

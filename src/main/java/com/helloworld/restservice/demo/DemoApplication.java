package com.helloworld.restservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;






@SpringBootApplication
//Combines:
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

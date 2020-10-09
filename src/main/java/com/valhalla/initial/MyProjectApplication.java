package com.valhalla.initial;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		Logger log = LoggerFactory.getLogger(MyProjectApplication.class);
		log.info("Spring Boot app started");
	}

	public String getStatus() {
		return "Success";
	}
}

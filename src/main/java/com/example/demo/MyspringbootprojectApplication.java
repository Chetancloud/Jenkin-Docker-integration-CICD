package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class MyspringbootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootprojectApplication.class, args);
		
		System.out.println("This is for Git testing");
	
		
	}

}

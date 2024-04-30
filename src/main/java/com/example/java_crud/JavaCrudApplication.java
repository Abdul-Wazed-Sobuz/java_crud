package com.example.java_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.java_crud.entity")
public class JavaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCrudApplication.class, args);
	}

}

package com.example.finalproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.finalproject.DAO")
public class FinalProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}

}

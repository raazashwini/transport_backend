package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BasicLoginLogoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicLoginLogoutApplication.class, args);
	}

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

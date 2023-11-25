package com.upao.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.upao.proyecto.service")
public class ClothCycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClothCycleApplication.class, args);
	}

}

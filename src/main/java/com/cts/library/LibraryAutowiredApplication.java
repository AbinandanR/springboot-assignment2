package com.cts.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cts.library")
public class LibraryAutowiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryAutowiredApplication.class, args);
	}

}

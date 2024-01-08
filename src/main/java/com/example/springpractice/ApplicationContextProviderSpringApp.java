package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication(
		exclude={ DataSourceAutoConfiguration.class }
)
@ComponentScan(
		basePackages={ "com.example.springpractice.ApplicationContextTest", "com.example.springpractice.EmptyBean" }
)
public class ApplicationContextProviderSpringApp {
	
	/*
	 * Выводим все имена всех доступных Bean при запуске
	 */
	public static void main(String[] args) throws
	                                       IOException {
		SpringApplication.run(ApplicationContextProviderSpringApp.class, args);
	}
	
}

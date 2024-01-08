package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
//		exclude={ DataSourceAutoConfiguration.class }
)
@ComponentScan(
		basePackages={ "com.example.springpractice.ApplicationContextTest",
				//				"com.example.springpractice.Test"
		}
)
@EnableJpaRepositories(basePackages="com.example.springpractice.TransactionalTest.JPA")
public class TransactionalSpringApp {
	
	public static void main(String[] args) {
		SpringApplication.run(TransactionalSpringApp.class, args);
	}
}

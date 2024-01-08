package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
		exclude={ DataSourceAutoConfiguration.class }
)
@ComponentScan(
		basePackages={ "com.example.springpractice.BeanLifecycleTest",
				//				"com.example.springpractice.EmptyBean"
		}
)
public class BeanLifecycleSpringBootApp {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BeanLifecycleSpringBootApp.class,
		                                                               args
		);
		context.close( );
	}
}

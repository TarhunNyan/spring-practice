package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {
    "com.example.springpractice.AOP",
    //				"com.example.springpractice.EmptyBean"
})
public class AOPTestSpringApp {

    public static void main(String[] args) {
        SpringApplication.run(AOPTestSpringApp.class, args);
    }

}

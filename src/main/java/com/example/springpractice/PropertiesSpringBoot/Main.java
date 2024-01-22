package com.example.springpractice.PropertiesSpringBoot;

import com.example.springpractice.BeanLifecycleSpringBootApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
    exclude = {DataSourceAutoConfiguration.class}
)
@ComponentScan(
    basePackages = {
        "com.example.springpractice.PropertiesSpringBoot",
        //				"com.example.springpractice.EmptyBean"
    }
)
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(
            Main.class,
            args
        );
    }
}

package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
    exclude = {DataSourceAutoConfiguration.class}
)
@ComponentScan(basePackages = {
    "com.example.springpractice.Profile",
    //				"com.example.springpractice.Test"
})
public class ProfileSpringBootApp {

    public static void main(String[] args) {
        // -----------------------
        // Задаем настройки, с профилями используя SpringBuilder
        // new SpringApplicationBuilder()
        //     .properties("spring.config.name=profile")
        //     .sources(ProfileSpringBootApp.class)
        //     .run();

        // -----------------------
        // Задаем настройки, с профилями используя System
        // System.setProperty("spring.config.name", "profile");
        // SpringApplication app = new SpringApplication(ProfileSpringBootApp.class);
        // app.run(args);

        // -----------------------
        // Задаем профили используя System
        SpringApplication app = new SpringApplication(ProfileSpringBootApp.class);
        app.setAdditionalProfiles("dev");
        app.run(args);

    }
}


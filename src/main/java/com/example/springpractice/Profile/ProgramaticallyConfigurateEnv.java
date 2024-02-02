package com.example.springpractice.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@Profile("dev")
public class ProgramaticallyConfigurateEnv {

    @Bean
    public SomeClass SomeClass() {
        return new SomeClass("dev");
    }

}

package com.example.springpractice.Profile;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class ProgramaticallyComponent {
    @PostConstruct
    public void init() {
        System.out.println("ProgramaticallyComponent: test");
    }
}

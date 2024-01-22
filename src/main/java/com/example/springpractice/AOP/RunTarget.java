package com.example.springpractice.AOP;

import jakarta.annotation.PostConstruct;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunTarget {
    @Autowired
    Target target;

    @PostConstruct
    void init () {
        target.method1(List.of(1, 20, 300, 400, 9999));
        target.method2();
        target.check();
    }
}

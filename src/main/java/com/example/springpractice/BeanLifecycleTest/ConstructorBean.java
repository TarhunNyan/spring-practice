package com.example.springpractice.BeanLifecycleTest;

import com.example.springpractice.ApplicationContextTest.ApplicationContextProvider;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ConstructorBean {

    ConstructorBean() {
        System.out.println("ConstructorBean: внедрение зависимостей на основе Constructor");
    }

}

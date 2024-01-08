package com.example.springpractice.BeanLifecycleTest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SetterBean {
	SetterBean() {
		System.out.println("SetterBean: внедрение зависимостей на основе " +
				                   "Setter");
	}
}

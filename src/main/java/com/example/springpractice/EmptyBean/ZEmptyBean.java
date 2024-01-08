package com.example.springpractice.EmptyBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZEmptyBean {
	
	@Bean
	public static ZEmptyClass zemptyBeanMethod( ) {
		return new ZEmptyClass("SomeValue");
	}
}

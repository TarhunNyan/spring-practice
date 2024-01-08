package com.example.springpractice.ApplicationContextTest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ApplicationContextProvider {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public void PrintAppliationContextBeans( ) {
		String[]     beans     = applicationContext.getBeanDefinitionNames( );
		List<String> listBeans = Arrays.asList(beans);
		
		listBeans.stream( )
		         .sorted( )
		         .forEach(System.out::println);
	}
	
	@PostConstruct
	private void init( ) {
		System.out.println("ApplicationContextProvider: init");
		this.PrintAppliationContextBeans( );
	}
}

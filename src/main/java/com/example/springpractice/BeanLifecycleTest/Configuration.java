package com.example.springpractice.BeanLifecycleTest;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean(initMethod="initConfigMethod", destroyMethod="destroyConfigMethod")
	public TestBean confTestBean(
			ConstructorBean constructorBean) {
		System.out.println("Configure: происходит конфигурация " +
				                   "TestBean" );
		return new TestBean(constructorBean);
	}
	
	@Bean
	public BeanPostProcessor LifecycleProcessor() {
		return new Processor("confTestBean");
	}
}

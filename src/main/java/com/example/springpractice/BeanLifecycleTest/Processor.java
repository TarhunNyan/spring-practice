package com.example.springpractice.BeanLifecycleTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Processor implements BeanPostProcessor {
	
	private String beanName;
	
	public Processor(String beanName) {
		this.beanName = beanName;
	}
	
	@Override
	public Object postProcessBeforeInitialization(
			Object bean, String beanName
	) throws
	  BeansException {
		if(beanName.equals(this.beanName)) {
			System.out.println(
					"TestBean: запущен postProcessBeforeInitialization" +
							"(пробегается по всем Bean), имплементированный " +
							"от BeanPostProcessor");
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean,
		                                                               beanName
		);
	}
	
	@Override
	public Object postProcessAfterInitialization(
			Object bean, String beanName
	) throws
	  BeansException {
		if(beanName.equals(this.beanName)) {
			System.out.println(
					"TestBean: запущен postProcessAfterInitialization" + "(пробегается по всем Bean), имплементированный " + "от BeanPostProcessor");
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean,
		                                                              beanName
		);
	}
}

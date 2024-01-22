package com.example.springpractice.BeanLifecycleTest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class TestBean implements InitializingBean, CommandLineRunner, BeanNameAware, SmartLifecycle, DisposableBean {

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("TestBean: запущен destroy, имплементированный от DisposableBean");
    }

    // SmartLifecycle
    private boolean isRunning = false;

    @Override
    public void start() {
        isRunning = true;
        System.out.println("TestBean: запущен start, имплементированный от SmartLifecycle");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("TestBean: запущен stop, имплементированный от SmartLifecycle");
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        System.out.println("TestBean: запущен setBeanName, имплементированный от BeanNameAware");
    }

    // CommandLineRunner
    @Override
    public void run(String... args) throws Exception {
        System.out.println("TestBean: запущен run, имплементированный от CommandLineRunner");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestBean: запущен afterPropertiesSet, имплементированный от InitializingBean");
    }

    // Static-конструктор
    static {
        String staticVariable = staticMethod();
    }

    public static String staticMethod() {
        System.out.println("TestBean: запущен Static-block");
        return "staticResult";
    }

    // Конструктор
    public TestBean(ConstructorBean constructorBean) {
        System.out.println("TestBean: запущен Constructor");
    }

    // EventListener
    /*
     * @EventListener, переопределяет метод onApplicationEvent из интерфеса
     * ApplicationListener<ContextRefreshedEvent>
     *
     * С аннотацией, это просто упрощенный синтаксис
     *
     * Вызывается при окончании инициализации ApplicaitonContext
     */
    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(
            "TestBean: запущен onApplicationEvent, имплементированный от ApplicationListener<ContextRefreshedEvent>");
    }

    // Setter
    private SetterBean setterBean;

    @Autowired
    public void setSetterBean(
        SetterBean setterBean
    ) {
        System.out.println("TestBean: запущен Setter");
        this.setterBean = setterBean;
    }

    // PostConstructor и PreDestroy
    @PostConstruct
    private void postConstruct() {
        System.out.println("TestBean: запущен метод с аннотацией PostConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("TestBean: запущен метод с аннотацией PreDestroy");
    }

    // Configuration
    public void initConfigMethod() {
        System.out.println("TestBean: запущен метод прописанный в Configuration как init-метод");
    }

    public void destroyConfigMethod() {
        System.out.println("TestBean: запущен метод прописанный в Configuration как destroy-метод");
    }

}

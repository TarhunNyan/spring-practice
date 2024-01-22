package com.example.springpractice.AOP;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Target {
    public void method1(List<Integer> list) {
//        list.add(0);
        System.out.println("method method1(): MyService method1 list.size=" + list.size());
    }

    private void privateMethod() {
        System.out.println("it is private");
    }

//    @SomeAnnotationForAspect
    @Transactional
    public void method2() {
        System.out.println("method method2(): MyService method2");
        privateMethod();
    }

    public boolean check() {
        System.out.println("method check(): MyService check");
        return true;
    }

}

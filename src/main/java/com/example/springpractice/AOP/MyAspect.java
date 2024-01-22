package com.example.springpractice.AOP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Aspect
@Component
public class MyAspect {

//    final private String stringValue = "MyAspect";
//
//    @Pointcut("execution(* com.example.springpractice.AOP.Target.*(..)) && args(list,..)")
//    public void callAtTargetListArgs(List<Integer> list) {}
//
//    @Before("callAtTargetListArgs(list)")
//    public void beforeCallListArgs(List<Integer> list) {
//        System.out.println("first argument list: " + list.toString());
//    }
//
//    @Pointcut("execution(private * com.example.springpractice.AOP.Target.*(..))")
//    public void callAtTargetPrivate() {}
//
//    @Before("callAtTargetPrivate()")
//    public void beforePrivateCall(JoinPoint jp) {
//        System.out.println("Before private: aspect value: " + stringValue);
//    }
//
//    @Pointcut("execution(public * com.example.springpractice.AOP.Target.*(..))")
//    public void callAtTargetPublic() {}
//
//    @Before("callAtTargetPublic()")
//    public void beforeCall(JoinPoint jp) {
//        System.out.println("Before: aspect value: " + stringValue);
//    }
//
//    @After("callAtTargetPublic()")
//    public void afterCall(JoinPoint jp) {
//        System.out.println("After: aspect value: " + stringValue + "\n");
//    }
//    @Pointcut("@annotation(SomeAnnotationForAspect)")
//    public void callAtTargetAnnotate() {}
//
//    @Before("callAtTargetAnnotate()")
//    public void beforeAnnotateCall(JoinPoint jp) {
//        System.out.println("Current Method is ANNOTATE!!!");
//        System.out.println("aspect value: " + stringValue);
//    }

}

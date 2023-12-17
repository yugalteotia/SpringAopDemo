package com.yugal.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com..*)")
    public void authenticatingPointCut() {
    }

    @Pointcut("within(com..*)")
    public void authorizationPointCut() {
    }

    //  com..checkout(..) can also be used to allow all the child packages or classes to find the specified method
//    @Before("execution(* com..checkout(..))")
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void beforeCheckout() {
        System.out.println("authentication is in process");
    }
}
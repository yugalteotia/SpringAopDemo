package com.yugal.aspects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component      //  we also have to add component so that this class can be scanned by beanConfig as a bean to inject its method
public class LoggingAspect {
    @Before("execution(* com.yugal.services.ShoppingCart.checkout(..))")        //  To match the signature of checkout method we have to add these 2 dots
    public void beforeCheckout(JoinPoint jp) {
        System.out.println(jp.getSignature());
        System.out.println("before checkout");
    }

    @After("execution(* com.yugal..*.checkout(..))")     //  ..*. mentions that this method can belong to any subpackage or any class into com.yugal
    public void afterCheckout() {
        System.out.println("after checkout");
    }

}
package com.yugal.services;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public ShoppingCart() {
        System.out.println("This is the bean of ShoppingCart");
    }

    public void checkout(String str) {
        //  Cross-cutting concerns should not be in business logic
        //  logging, authentication or authorization & sanitization of data
        System.out.println("Checkout method from shopping called | status:" + str);
    }
}
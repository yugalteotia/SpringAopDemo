package com.yugal.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.yugal")
@EnableAspectJAutoProxy     //  enables the aspect to work just like we add the scope of component scan to scan the classes to make beans
public class BeanConfig {
}
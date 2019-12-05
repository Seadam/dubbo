package com.archer.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Author: Archer
 * @Date: 2019/12/1
 * @Description:
 * @Version: 1.0
 */
public class AnnotationProvider {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.in.read();
    }
}

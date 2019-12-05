package com.archer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}

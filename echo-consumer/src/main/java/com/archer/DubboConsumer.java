package com.archer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        DemoService service = (DemoService) context.getBean("demoService");
        System.out.println(service.sayHello("archer"));
    }
}

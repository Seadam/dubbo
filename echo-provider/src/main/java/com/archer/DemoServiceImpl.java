package com.archer;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("111");
        return "Hello " + name;
    }
}

package com.archer.annotation;

import com.alibaba.dubbo.rpc.service.EchoService;
import com.archer.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Archer
 * @Date: 2019/12/1
 * @Description:
 * @Version: 1.0
 */
public class AnnotationConsumer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        EchoConsumer consumer = context.getBean(EchoConsumer.class);
        consumer.echo("ecc");
    }
}

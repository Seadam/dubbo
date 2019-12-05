package com.archer.annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.archer.DemoService;
import org.springframework.stereotype.Component;

/**
 * @Author: Archer
 * @Date: 2019/12/1
 * @Description:
 * @Version: 1.0
 */
@Component
public class EchoConsumer {
    @Reference
    private IDemoService demoService;

    public String echo(String name) {
        return demoService.sayHello(name);
    }
}

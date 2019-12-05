package com.archer.annotation;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;

import java.net.InetSocketAddress;

@Service
public class DemoServiceImpl implements IDemoService {
    public String sayHello(String name) {
        System.out.println("111");
        InetSocketAddress addr = RpcContext.getContext().getRemoteAddress();
        return "Hello " + name + addr;
    }
}

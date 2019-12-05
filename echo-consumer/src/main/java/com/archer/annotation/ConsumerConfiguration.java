package com.archer.annotation;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Archer
 * @Date: 2019/12/1
 * @Description:
 * @Version: 1.0
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.archer.annotation")
@ComponentScan(value={"com.archer.annotation"})
public class ConsumerConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("echo-annotation-consumer");
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        return new ConsumerConfig();
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("129.204.146.161");
        registryConfig.setPort(2181);
        return registryConfig;
    }

}

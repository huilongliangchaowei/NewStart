package com.newStart.config;

import com.newStart.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 当前类为配置类  可以替代之前的配置文件
 *          <bean></bean>用来加组件   现在用@Bean
 */
@Configuration
public class MyAppConfig {

    //自动注入返回对象  id为方法名
    @Bean
    public HelloService helloService(){
        System.out.println("开始注入HelloService");
        return new HelloService();
    }
}

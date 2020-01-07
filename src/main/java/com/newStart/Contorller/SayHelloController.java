package com.newStart.Contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
/**
 * 验证@value 获取配置文件中的值
 *
 */

    @Value("${person.name}")
    private String name;
    @RequestMapping("/sayhello")
    public String say(){
        return "Hello"+name;
    }
}

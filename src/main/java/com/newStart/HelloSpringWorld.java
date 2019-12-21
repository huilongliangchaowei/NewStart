package com.newStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 主程序类 SpringBootApplocation标注
 *
 * 扫描配置：AutoiCongfigurationPackage  扫到主类包下的标注
 *
 * */
@SpringBootApplication
public class HelloSpringWorld {
    //主程序启动
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringWorld.class,args);
    }
}

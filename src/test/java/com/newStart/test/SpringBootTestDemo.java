package com.newStart.test;

import com.newStart.bean.PerSon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemo {
    @Autowired
    private PerSon perSon;

    @Autowired
    ApplicationContext ioc;
    @Test
    public void contextLoads(){
        System.out.println(perSon);
    }

    @Test
    public void ifExit(){

        System.out.println( ioc.containsBean("helloService"));
    }

}

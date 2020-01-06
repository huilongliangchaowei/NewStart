package com.newStart.test;

import com.newStart.bean.PerSon;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemo {
    @Autowired
    private PerSon perSon;

    @Test
    public void contextLoads(){
        System.out.println(perSon);
    }
}

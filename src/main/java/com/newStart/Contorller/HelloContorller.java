package com.newStart.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContorller {
    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
}

package com.newStart.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ResponseBody
 * @Controller
 */
@RestController
public class HelloContorller {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
}

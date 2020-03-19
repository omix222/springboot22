package com.example.omix222.demo22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/")
    public String hello(){
        String result = helloService.concat("helllo ","SpringBoot 2.2");
        return result;
    }
    @RequestMapping("/hello")
    public String helloQuru() {
        String aa = "dummy";
        aa= aa+"bb";
        return "Hello Guru!!";
    }
}

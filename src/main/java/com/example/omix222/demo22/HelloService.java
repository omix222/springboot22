package com.example.omix222.demo22;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String concat(String str1,String str2) {
        return str1+str2;
    }
}

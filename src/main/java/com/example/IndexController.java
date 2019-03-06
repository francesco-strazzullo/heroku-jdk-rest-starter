package com.example;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {

    public static Date uptime = new Date();

    @RequestMapping("/")
    public String main(){
        return "Spring Boot Server - " + uptime.toString();
    }
}

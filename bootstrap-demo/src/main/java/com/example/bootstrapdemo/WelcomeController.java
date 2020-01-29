package com.example.bootstrapdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class WelcomeController {
    @RequestMapping("/")
    public String loginMessage(){
        System.out.println("returning index");
        return "index";
    }
    @RequestMapping("/01")
    public String pageOne(){
        return "01";
    }
}

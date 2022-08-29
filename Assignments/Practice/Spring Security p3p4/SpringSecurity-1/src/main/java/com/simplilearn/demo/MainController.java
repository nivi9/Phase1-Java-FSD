package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hey..hii";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hey, I was protected from the User";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hii from admin";
    }

}
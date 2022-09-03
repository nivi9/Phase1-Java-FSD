package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "HII.. WELCOME TO THE QUIZ PAGE";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hey, Welcome NIVETHA KAMAL.. Are You Ready for the Quiz Competition ";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hii.. You Can Add, Delete or Edit the Quiz Details";
    }

}
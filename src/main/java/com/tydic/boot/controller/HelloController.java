package com.tydic.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello11")
    public String handle01(){
        return "Hello，spring Boot 2！ 31pushTest";
    }

}

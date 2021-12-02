package com.ymw.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ymw")
public class FirstController {
    @Value("${person.name}")
    String name;

    @Resource
    private Environment environment;

    @RequestMapping("/first")
    public String first(){
        String property = environment.getProperty("person.name");
        return "first " + name + property;
    }
}

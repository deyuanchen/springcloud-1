package com.aotain.bootannotation.controller;

import com.aotain.bootannotation.properties.AuthorProperty;
import com.aotain.customautoconfiguration.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bang
 * @date 2018/7/1 11:05
 */
@RestController
public class HelloController2 {
    @Autowired
    private AuthorProperty authorProperty;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String index(){
        return "book name is +"+authorProperty.getName()+",book author is "+authorProperty.getAuthor();
    }

    @RequestMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }
}

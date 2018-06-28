package com.aotian.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author HP
 * @date 2018/06/27
 */
@RestController
public class ServiceHiController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}

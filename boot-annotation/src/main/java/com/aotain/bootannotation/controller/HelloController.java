package com.aotain.bootannotation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bang
 * @date 2018/7/1 10:30
 */
@RestController
public class HelloController {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

//    @RequestMapping("/")
    public String index(){
        return "book name is +"+bookName+",book author is "+bookAuthor;
    }
}

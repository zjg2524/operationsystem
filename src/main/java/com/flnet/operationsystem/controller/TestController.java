package com.flnet.operationsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjingui
 * @create: 2018-11-16 10:55
 **/
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/index")
    public String toIndex()
    {
        return "index";
    }


}


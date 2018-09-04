package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class Controller {

    @RequestMapping("/hello")
    public String HelloWold()  {
        return "hello world by using eureka zjc HAHA";
    }
}

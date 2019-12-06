package com.wcc.aop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangcc
 * @create 2019-12-06 17:03
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("name")
    public String yourName(){
        return "hello";
    }
}

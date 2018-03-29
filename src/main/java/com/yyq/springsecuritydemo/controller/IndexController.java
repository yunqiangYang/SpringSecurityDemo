package com.yyq.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yyq
 * @date 2018/3/29 18:33
 */
@Controller
@RequestMapping("")
public class IndexController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}

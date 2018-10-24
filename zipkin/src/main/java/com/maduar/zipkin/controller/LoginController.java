package com.maduar.zipkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *
 * @author maduar
 * @date 07/09/2018 3:17 PM
 * @email maduar@163.com
 *
 * */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }
}

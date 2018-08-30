package com.maduar.feign.controller;

import com.maduar.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *
 * @author maduar
 * @date 30/08/2018 11:21 AM
 * @email maduar@163.com
 *
 * */
@RestController
public class TestController {

    @Autowired
    private ApiService apiService;

    @GetMapping("test")
    public String index() {
        String str = apiService.index();
        return str;
    }
}

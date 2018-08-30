package com.maduar.feign.service;

import org.springframework.stereotype.Component;

/*
 *
 * @author maduar
 * @date 30/08/2018 11:33 AM
 * @email maduar@163.com
 *
 * */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务发生故障！";
    }
}

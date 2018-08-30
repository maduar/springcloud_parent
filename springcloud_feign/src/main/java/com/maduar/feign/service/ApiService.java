package com.maduar.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *
 * @author maduar
 * @date 29/08/2018 10:02 AM
 * @email maduar@163.com
 *
 * */
@FeignClient(serviceId = "springcloud-client", fallback = ApiServiceError.class)
public interface ApiService {

    @GetMapping(value = "/springcloud-client/api/index")
    String index();

}

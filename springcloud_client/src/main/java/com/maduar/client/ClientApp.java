package com.maduar.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
public class ClientApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientApp.class).web(true).run(args);
    }
}

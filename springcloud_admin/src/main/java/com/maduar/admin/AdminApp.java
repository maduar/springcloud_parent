package com.maduar.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class AdminApp {
    public static void main( String[] args ) {
        SpringApplication.run(AdminApp.class, args);
    }
}

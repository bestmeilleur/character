package com.huan.luo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luohuan on 15/11/9.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class WebServer {
    public static void main(String[] args) {
        SpringApplication.run(WebServer.class);
    }
}

package com.huan.luo.web;

import com.huan.luo.auth.AuthorityAnnotationAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by luohuan on 15/11/9.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class WebServer extends WebMvcConfigurerAdapter{
    public static void main(String[] args) {
        SpringApplication.run(WebServer.class);
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthorityAnnotationAdapter()).addPathPatterns("/**");
    }
}

package com.xdclass.userapp;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author john
 */
@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.xdclass.userapp.service.dubbo")
@MapperScan("com.xdclass.userapp.mapper")
public class UserAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserAppApplication.class, args);
    }

}

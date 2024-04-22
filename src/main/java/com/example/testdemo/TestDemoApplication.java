package com.example.testdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 项目启动类
 * @Author: 申延胜
 * @Date: 2024-04-16 10:56:35
 */
// spring扫描包，扫描Controller、Service
@ComponentScan(basePackages = {"com.example"})
// spring扫描 mapper
@MapperScan({"com.example.*.mapper"})
// springboot 启动注解
@SpringBootApplication
public class TestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDemoApplication.class, args);
    }

}

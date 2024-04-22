package com.example.test.controller;

import com.example.test.dto.TestDto;
import com.example.test.server.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 申延胜
 * @DATE 2024/4/16 上午11:16
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        String str = "hello world";
        return str;
    }

    /**
     * @Description:
     * @Author: 申延胜
     * @return List<TestDto>
     * @Date: 2024-04-16 11:58:05
     */
    @RequestMapping(value = "getSelectUser", method = RequestMethod.POST)
    public List<TestDto> getSelectUser(){
        List<TestDto> selectUser = testService.getSelectUser();
        return selectUser;
    }
}

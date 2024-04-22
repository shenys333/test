package com.example.test.server;

import com.example.test.dto.TestDto;

import java.util.List;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author 申延胜
 * @DATE 2024/4/16 上午11:39
 **/
public interface TestService {

    /**
     * @Description:
     * @Author: 申延胜
     * @return java.util.List<com.example.test.dto.TestDto>
     * @Date: 2024-04-16 11:54:03
     */
    List<TestDto> getSelectUser();
}

package com.example.test.server.impl;

import com.example.test.dto.TestDto;
import com.example.test.mapper.TestMapper;
import com.example.test.server.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author 申延胜
 * @DATE 2024/4/16 上午11:39
 **/
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    /**
     * @return java.util.List<com.example.test.dto.TestDto>
     * @Description:
     * @Author: 申延胜
     * @Date: 2024-04-16 11:54:03
     */
    @Override
    public List<TestDto> getSelectUser() {
        List<TestDto> selectUser = testMapper.getSelectUser();
        return selectUser;
    }
}

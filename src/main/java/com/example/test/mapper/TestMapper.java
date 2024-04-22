package com.example.test.mapper;

import com.example.test.dto.TestDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName TestMapper
 * @Description TODO
 * @Author 申延胜
 * @DATE 2024/4/16 上午11:38
 **/
@Repository
public interface TestMapper {

    /**
     * @Description:
     * @Author: 申延胜
     * @return java.util.List<com.example.test.dto.TestDto>
     * @Date: 2024-04-16 11:54:03
     */
    List<TestDto> getSelectUser();

    }

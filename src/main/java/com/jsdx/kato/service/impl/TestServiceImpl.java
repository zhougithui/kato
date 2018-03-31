package com.jsdx.kato.service.impl;

import com.jsdx.kato.mapper.TestEntityMapper;
import com.jsdx.kato.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestEntityMapper testEntityMapper;

}

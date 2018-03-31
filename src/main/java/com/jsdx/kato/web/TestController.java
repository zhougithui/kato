package com.jsdx.kato.web;

import com.jsdx.kato.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("index")
    public String test(){
        return "home" + (testService != null);
    }
}

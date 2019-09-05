package com.gao.gaozi.example.testAsync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestAsync testAsync;

    @RequestMapping("/test")
    public void test() throws Exception{
        testAsync.testAsync();
        System.out.println("111111");
    }
}

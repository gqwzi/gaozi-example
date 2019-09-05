package com.gao.gaozi.example.testAsync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestAsync {

    @Async
    public void testAsync() throws Exception{
        Thread.sleep(10000);
        System.out.println("22222");
    }
}

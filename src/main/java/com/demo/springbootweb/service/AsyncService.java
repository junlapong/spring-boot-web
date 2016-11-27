package com.demo.springbootweb.service;

import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@EnableAsync
@Service
public class AsyncService {

    @Async
    public Future<Boolean> runJob(String message) throws InterruptedException {
        boolean result = false;
        //Long running job
        Thread.sleep(10000);
        result = true;
        System.out.println("Done running...");
        return new AsyncResult<Boolean>(result);
    }
}

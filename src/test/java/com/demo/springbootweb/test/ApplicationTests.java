package com.demo.springbootweb.test;

import com.demo.springbootweb.service.AsyncService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AsyncService.class)
@WebAppConfiguration
public class ApplicationTests {

    @Autowired
    private AsyncService asyncService;

    @Test
    public void test() throws InterruptedException, ExecutionException {
        System.out.println("Running tests");
        Future<Boolean> asyncResult = asyncService.runJob("hello");
        Boolean result = asyncResult.get();
        System.out.println("And the result of get() is " + result);
        Assert.assertTrue(result);
    }

}

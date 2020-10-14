package com.zrt.ad.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author:zrt
 * @Description:com.zrt.ad.runner
 * @version:1.0
 */
@Component
public class Runner02 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Running Runner02");
    }
}

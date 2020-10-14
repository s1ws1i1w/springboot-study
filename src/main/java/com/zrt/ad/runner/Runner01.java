package com.zrt.ad.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author:zrt
 * @Description:com.zrt.ad.runner
 * @version:1.0
 */
@Component
@Order(value = 1)
public class Runner01  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running Runner01");
    }
}

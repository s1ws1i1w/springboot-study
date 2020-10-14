package com.zrt.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author:zrt
 * @Description:com.zrt.ad
 * @version:1.0
 */
@EnableScheduling
@SpringBootApplication
public class SpringbootStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class,args);
    }
}

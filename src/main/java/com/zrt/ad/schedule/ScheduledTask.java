package com.zrt.ad.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author:zrt
 * @Description:com.zrt.ad.schedule
 * @version:1.0
 */
@Component
public class ScheduledTask {

    @Scheduled(fixedRate = 1000)
    public void helloSpringBoot(){
        System.out.println("Hello SpringBoot");
    }

}

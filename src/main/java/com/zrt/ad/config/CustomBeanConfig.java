package com.zrt.ad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:zrt
 * @Description:com.zrt.ad.config
 * @version:1.0
 */
@Configuration
public class CustomBeanConfig {
    /**
     * 1.使用public修饰@Bean注解的方法
     * 2.把RestTemplate交由Spring容器管理,使用时可以使用@Autowried注解注入
     * 3.可以方便的对RestTemplate(Bean)做属性方面的定制工作
     */
    @Bean
    public RestTemplate restTemplate(){return new RestTemplate();}
}

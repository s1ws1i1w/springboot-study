package com.zrt.ad.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author:zrt
 * @Description:com.zrt.ad.config
 * @version:1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.zrt.ad")
public class MySQLConfig {
     private String host;
     private String password;
     private  String username;
}

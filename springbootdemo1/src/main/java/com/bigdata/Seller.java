package com.bigdata;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ibm
 * @date 2018/10/24 19:49
 * @description
 */
@Data
@Component
@ConfigurationProperties(prefix ="my.config")
public class Seller {
    private String company;
    private String url;
}

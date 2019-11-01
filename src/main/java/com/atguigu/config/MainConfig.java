package com.atguigu.config;

import com.atguigu.bean.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MainConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean()
    {
        return new ColorFactoryBean();
    }


}

package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.bean.Yellow;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class IOCTest_Profile {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev","prod");
        applicationContext.register(MainConfigOfProfile.class);
        applicationContext.refresh();

        //getBeanNamesForType                         通过类型获取Bean名称
        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }

        Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);
        applicationContext.close();
    }
}

package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void test01()
    {
        Object bean = applicationContext.getBean("colorFactoryBean");
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型："+bean.getClass());
        System.out.println(bean==bean2);

        Object bean3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean3.getClass());
    }
}

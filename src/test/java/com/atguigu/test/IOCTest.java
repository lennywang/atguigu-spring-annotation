package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import com.atguigu.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {


    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object bean = applicationContext.getBean("colorFactoryBean");
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型：" + bean.getClass());
        System.out.println(bean == bean2);

        Object bean3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean3.getClass());
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name:beanDefinitionNames)
        {
            System.out.println(name);
        }

        System.out.println("ioc 容器创建完成。。。");
        Object person = context.getBean("person");
        Object person2 = context.getBean("person");
        System.out.println(person == person2);
    }
}

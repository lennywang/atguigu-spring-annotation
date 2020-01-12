package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 **/
public class IOCTest_XML {

    @Test
    public void test()
    {
        //        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //        Person person = (Person) applicationContext.getBean("person");
        //        System.out.println(person);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        //        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        //        for (String beanName :beanNamesForType){
        //            System.out.println(beanName);
        //        }

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName:beanDefinitionNames){
            System.out.println(beanName);
        }
    }

}

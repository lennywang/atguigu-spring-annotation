package com.atguigu.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 **/
@Component
public class Cat  implements InitializingBean,DisposableBean {

    public Cat() {
        System.out.println("Cat...constructor...");
    }

    public void destroy() throws Exception {
        System.out.println("Cat...destroy...");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Cat...PostConstruct...");
    }

    @PreDestroy
    public void destory()
    {
        System.out.println("Cat...PreDestroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat...afterPropertiesSet...");
    }
}

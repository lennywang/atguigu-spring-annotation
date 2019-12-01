package com.atguigu.config;

import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 **/
@Configuration
@ComponentScan({"com.atguigu.controller","com.atguigu.service","com.atguigu.dao","com.atguigu.bean"})
public class MainConfigOfAutowired {

    //@Primary
    @Bean("bookDao2")
    public BookDao bookDao()
    {
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }

    @Bean
    public Color color(Car car)
    {
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}

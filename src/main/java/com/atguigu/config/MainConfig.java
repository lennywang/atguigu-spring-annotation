package com.atguigu.config;

import com.atguigu.bean.ColorFactoryBean;
import com.atguigu.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import sun.awt.SunHints;


@Configuration
@ComponentScans({
       @ComponentScan(value = "com.atguigu",includeFilters = {
               //@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class})
               @ComponentScan.Filter(type= FilterType.CUSTOM,classes = {MyFilterType.class})
       },useDefaultFilters = false)
})
//@ComponentScan(value = "com.atguigu",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//},useDefaultFilters = false)
public class MainConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean()
    {
        return new ColorFactoryBean();
    }

    @Bean
    public Person person()
    {
        return new Person("xiaoming",18,"xiaoming");
    }

}

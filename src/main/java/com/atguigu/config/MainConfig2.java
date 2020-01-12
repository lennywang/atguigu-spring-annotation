package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 *
 **/
//@Conditional({WindowsCondition.class})
@Configuration
public class MainConfig2 {

    //@Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person()
    {
        System.out.println("给容器中添加Person。。。");
        return new Person("李四",25,"李四");
    }

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01()
    {
        return new Person("Bill Gates",62,"Bill");
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02()
    {
        return new Person("Linus",62,"Linux");
    }


}

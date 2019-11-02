package com.atguigu.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@EnableTransactionManagement
@ComponentScan("com.atguigu.tx")
@Configuration
public class TxConfig{

    @Autowired
    private JdbcDataSource jdbcDataSource;

    @Bean
    public DataSource dataSource() throws Exception {
        System.out.println(jdbcDataSource);
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(jdbcDataSource.getUser());
        dataSource.setPassword(jdbcDataSource.getPassword());
        dataSource.setJdbcUrl(jdbcDataSource.getJdbcUrl());
        dataSource.setDriverClass(jdbcDataSource.getDriverClass());

//        dataSource.setUser("root");
//        dataSource.setPassword("root");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");//jdbc:mysql://localhost:3306/test
//        dataSource.setDriverClass("com.mysql.jdbc.Driver");

        System.out.println(dataSource.getDriverClass());
        System.out.println(dataSource.getJdbcUrl());
        System.out.println(dataSource.getUser());
        System.out.println(dataSource.getPassword());
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(dataSource());
    }
}

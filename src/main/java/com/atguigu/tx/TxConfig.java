package com.atguigu.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class TxConfig{

    public DataSource dataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser();
        dataSource.setPassword();
        dataSource.setJdbcUrl();
        dataSource.setDriverClass();
        return dataSource;
    }

}

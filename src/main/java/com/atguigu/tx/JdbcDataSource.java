package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/tx/config.properties")
@Configuration
public class JdbcDataSource {

    private String user;

    private String password;

    private String driverClass;

    private String jdbcUrl;

    public String getUser() {
        return user;
    }

    @Value("${jdbc.username}")
    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    @Value("${jdbc.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClass() {
        return driverClass;
    }

    @Value("${jdbc.driverclass}")
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    @Value("${jdbc.jdbcurl}")
    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}

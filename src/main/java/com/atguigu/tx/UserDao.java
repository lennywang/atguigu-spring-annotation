package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Random;
import java.util.UUID;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert()
    {
        String sql = "insert into tbl_user(username,age) values(?,?)";
        String username= UUID.randomUUID().toString().substring(0,5);
        Integer age =   new Random().nextInt(100)+1;
        jdbcTemplate.update(sql,username,age);
    }
}

package com.example.login.dao;

import com.example.login.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void getAllUser(){
        List<User> list = userMapper.getAllUser();
        for (User user:list) {
            System.out.println(user.getId()+",用户名:"+user.getUserName()+",密码:"+user.getPassword());
        }

    }
}

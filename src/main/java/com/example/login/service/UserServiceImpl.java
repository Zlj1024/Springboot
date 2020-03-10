package com.example.login.service;

import com.example.login.dao.UserMapper;
import com.example.login.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getUserList()
    {
        return userMapper.getAllUser();

    }
    public Object getLogin(String name,String pwd)
    {
        return userMapper.login(name,pwd);

    }
    public Integer modifyUser(Integer id,String loginTime) throws ParseException {
          return userMapper.modifyUserInfo(id,loginTime);

    }

}

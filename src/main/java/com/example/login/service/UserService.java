package com.example.login.service;

import com.example.login.dao.UserMapper;
import com.example.login.domain.User;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
@Service
public interface UserService {
    List<User> getUserList();
    Object getLogin(String name,String pwd);
    Integer modifyUser(Integer id, String loginTime) throws ParseException;
}

package com.example.login.controller;

import com.example.login.domain.User;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    //获得登录过用户列表
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getUser")
    public List<User> getUser(){
        List<User> userList=userService.getUserList();
        return userList;
    }
    //登录
    @RequestMapping("/login")
    public Object login(String userName,String password, HttpSession session)
    {
        Object user=userService.getLogin(userName,password);
        //System.out.println(user);
        return user;
    }
    //更新当前用户登录时间
    @RequestMapping("/modifyTime")
    public String modifyTime(Integer id)
    {
        Date loginTime= new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(loginTime));
        try {
              if(userService.modifyUser(id,sdf.format(loginTime))==1){
                  return "success";
            }
          } catch (ParseException e) {
            e.printStackTrace();
            return "error";
        }
        return null;
    }
}

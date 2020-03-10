package com.example.login.dao;

import com.example.login.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getAllUser();
    Integer modifyUserInfo(@Param("id")Integer id, @Param("loginTime") String time);
    Object login(@Param("userName") String name, @Param("password") String pwd);
}

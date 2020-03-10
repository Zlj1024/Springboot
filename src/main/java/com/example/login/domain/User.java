package com.example.login.domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;


@Validated
public class User {
     @NotNull
     private Integer id;
     @NotNull(message = "用户名不能为空")
     private String userName;
     @Length(min = 1, max = 6, message = "密码必须在1到6位之间")
     private String password;
     @JsonFormat(pattern="yyyy/MM/dd HH:mm:ss")
     private Date loginTime;

    public User() {
    }

    public User(String userName, String password, Date loginTime) {
        this.userName = userName;
        this.password = password;
        this.loginTime = loginTime;
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}

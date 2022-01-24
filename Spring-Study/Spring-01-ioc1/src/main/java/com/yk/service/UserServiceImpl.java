package com.yk.service;

import com.yk.dao.UserDao;
import com.yk.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    //利用set进行动态实现值得注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser() {
       userDao.getUser();
    }
}
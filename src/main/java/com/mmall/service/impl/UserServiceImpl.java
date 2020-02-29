package com.mmall.service.impl;

import com.mmall.dao.UserDao;
import com.mmall.pojo.UserInfo;
import com.mmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;
    
    @Override
    public UserInfo findAll(Integer id) {
        return userDao.findAll(id);
    }
}

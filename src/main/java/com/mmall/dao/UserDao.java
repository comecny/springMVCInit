package com.mmall.dao;

import com.mmall.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    UserInfo findAll(@Param("id")Integer id);
    
}

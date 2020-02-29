package com.mmall.service.impl;

import com.mmall.dao.TestDao;
import com.mmall.pojo.CatsInfo;
import com.mmall.service.TextServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextServicceImpl implements TextServicce {
    
    @Autowired
    private TestDao testDao;

    @Override
    public List<CatsInfo> findAll() {
        return testDao.findAll();
    }
}

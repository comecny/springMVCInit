package com.mmall.controller;

import com.mmall.pojo.CatsInfo;
import com.mmall.service.TextServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("hello")
public class HelloController {
     
    @Autowired
    private TextServicce textServicce;
    
    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    @ResponseBody
    public List<CatsInfo> test(){
        List<CatsInfo> list = textServicce.findAll();
        return list;
        
    }
    
}

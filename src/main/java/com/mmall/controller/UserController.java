package com.mmall.controller;

import com.mmall.common.MsgCode;
import com.mmall.common.Result;
import com.mmall.pojo.UserInfo;
import com.mmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService; 
    
   @RequestMapping(value = "/{id}/findAll.do",method = RequestMethod.GET)
   @ResponseBody
   public Result<UserInfo> findAll(@PathVariable(value = "id") Integer id){
       UserInfo info = userService.findAll(id);
      if (info != null){
          return new Result<UserInfo>(info, MsgCode.SUCCESS);
      }
          return new Result<UserInfo>(null,MsgCode.SUCCESS);
   }
}

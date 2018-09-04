package com.example.demo.controller;


import com.example.demo.entity.SysUserEntity;
import com.example.demo.service.SysUserService;
import com.example.demo.utils.JWTUtil;
import com.example.demo.utils.ResponseBean;
import com.example.demo.utils.StringTool;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private SysUserService userService;

    @PostMapping("/login")
    public ResponseBean login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        SysUserEntity userBean = userService.getByUsername(username);
        String entrypassword = StringTool.Encrypt(password, "MD5");
        if (userBean.getPassword().equalsIgnoreCase(entrypassword)) {
            ResponseBean responseBean = new ResponseBean();
            responseBean.setCode(200);
            responseBean.setMsg("Login success");
            HashMap<String,String> tokenmap = new HashMap<>() ;
            String token = JWTUtil.sign(username);
            tokenmap.put("token",token);
            responseBean.setData(tokenmap);
            return responseBean;
        } else {
            throw new UnauthorizedException();
        }
    }

    @GetMapping("/article")
    //@RequiresAuthentication
    public ResponseBean article() {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject.isAuthenticated()) {
//            return new ResponseBean(200, "You are already logged in", null);
//        } else {
//            return new ResponseBean(200, "You are guest", null);
//        }
                   return new ResponseBean(200, "You are guest", null);

    }

}

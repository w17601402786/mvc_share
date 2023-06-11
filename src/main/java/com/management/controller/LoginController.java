package com.management.controller;

import com.management.pojo.User;
import com.management.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@RestController
public class LoginController {

    
    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map<String,Object> processLogin(User user, HttpServletRequest request) {


        Map<String,Object> map = new HashMap<>();

        if (loginService.login(user)) {
            request.getSession().setAttribute("loggedInUser", user.getName());
            map.put("status",200);
            map.put("msg","Login successfully");
        } else {
            map.put("status",500);
            map.put("msg","Login failed");
        }
        return map;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Map<String,Object> processRegister(User user) {

        Map<String,Object> map = new HashMap<>();

        if (loginService.register(user)) {
            map.put("status",200);
            map.put("msg","Register successfully");
        } else {
            map.put("status",500);
            map.put("msg","Register failed");
        }

        return map;
    }



}

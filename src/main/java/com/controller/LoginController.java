package com.controller;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("user") User user, Model model){

        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String hello(){

        System.out.println("你好");
        return "login";
    }


}

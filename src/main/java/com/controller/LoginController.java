package com.controller;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @RequestMapping("/show")
    public String show() {
        // 在这里添加您的业务逻辑，例如从数据库中获取学生信息
        return "show";
    }


    @RequestMapping("/input")
    public String input() {
        // 在这里添加您的业务逻辑，例如从数据库中获取学生信息
        return "input";
    }

}

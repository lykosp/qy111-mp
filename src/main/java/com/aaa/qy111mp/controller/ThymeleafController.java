package com.aaa.qy111mp.controller;

import com.aaa.qy111mp.entity.Users;
import com.aaa.qy111mp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ThymeleafController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/toHelloPage")
    public String toHelloPage(Model model, HttpSession session){
        // 往request中存数据
        model.addAttribute("username","zhangsan");
        //往session中存数据
        session.setAttribute("password","123");
        List<Users> usersList=usersService.selectList(null);
        model.addAttribute("usersList",usersList);
        model.addAttribute("usersid","123");
        return "Hello";
    }

    @RequestMapping("/toLayui")
    public String toLayui(){
        return "layui";
    }
}

package com.example.demo.controller;

import com.example.demo.bean.Employee;
import com.example.demo.bean.User;
import com.example.demo.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    private ILoginService loginService;
    public LoginController(ILoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping(value = "/login")
    public String login(String username, String userpassword, Map<String,Object> map, HttpSession session){
        List<User> list = loginService.selectByUsernameAndPassword(username,userpassword);
        if(!list.isEmpty()){
            session.setAttribute("loginUser","username");
            return "redirect:/main";
        }else {
            map.put("msg","用户名密码错误");
            return "index";
        }
    }
    @GetMapping(value = "/registers")
    public String register(){
        return "/register/userAdd";
    }

    @PostMapping("/register")
    public String addEmp(User user,String username,String password,
                         Map<String,Object> map,HttpServletResponse response) throws IOException {
        List<User> list = loginService.selectByUsernameAndPassword(username,password);
        if(list.isEmpty()){
            loginService.addUser(user);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("<script>alert('注册成功请登录');</script>");
            return "/index";
        }else {
            map.put("msg","用户名已存在，请重新输入");
            return "/register/userAdd";
        }
    }
}

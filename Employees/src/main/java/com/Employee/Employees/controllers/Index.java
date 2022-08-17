package com.Employee.Employees.controllers;

import com.Employee.Employees.models.User;
import com.Employee.Employees.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class Index {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/index")
    public ModelAndView index(){
        List<User> users = this.userRepository.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("users", users);
        return mv;
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}


package com.Employee.Employees.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {

    @GetMapping("index/register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("register");
        mv.addObject("nome","Maria!");
        return mv;
    }
}

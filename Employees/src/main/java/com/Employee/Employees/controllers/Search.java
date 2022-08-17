package com.Employee.Employees.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Search {

    @GetMapping("index/search")
    public ModelAndView search(){
        ModelAndView mv = new ModelAndView("search");
        mv.addObject("nome", "FOI SIM");
        return mv;
    }
}

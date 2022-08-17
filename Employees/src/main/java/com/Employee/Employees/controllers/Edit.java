package com.Employee.Employees.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Edit {

    @GetMapping("index/edit")
    public String edit(){
        return "edit";
    }
}

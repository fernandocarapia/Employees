package com.Employee.Employees.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Delete {

    @GetMapping("index/delete")
    public String delete(){
        return "delete";
    }
}
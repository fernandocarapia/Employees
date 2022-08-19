package com.Employee.Employees.controllers;

import com.Employee.Employees.dto.NewUser;
import com.Employee.Employees.models.User;
import com.Employee.Employees.repositories.UserRepository;
import com.Employee.Employees.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class Index {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public ModelAndView index() {
        List<User> users = this.userRepository.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("users", users);
        return mv;
    }

    @GetMapping("/register")
    public String register() {
        return "/register";
    }

    @PostMapping("/register/save")
    public String saveRegister(@Validated User user, BindingResult result, RedirectAttributes redirect){

        if(result.hasErrors()){
            redirect.addFlashAttribute("mensagem","Verifique os campos Obrigatorios");
            return "/register";

        }
        this.userService.save(user);

        return "/index";
    }
//    @GetMapping("/edit/{id}")
//    public ModelAndView getEdit(@PathVariable("id") Long id){
//
//        ModelAndView mv= new ModelAndView("register");
//        List<User> users = this.userService.;
//        mv.addObject("", );
//        return mv;
//    }

}


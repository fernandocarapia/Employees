package com.Employee.Employees.service;

import com.Employee.Employees.models.User;
import com.Employee.Employees.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        this.userRepository.save(user);
    }
}

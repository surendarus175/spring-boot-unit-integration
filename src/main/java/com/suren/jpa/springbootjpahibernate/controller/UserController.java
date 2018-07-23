package com.suren.jpa.springbootjpahibernate.controller;

import com.suren.jpa.springbootjpahibernate.repository.UserRepository;
import com.suren.jpa.springbootjpahibernate.resource.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}

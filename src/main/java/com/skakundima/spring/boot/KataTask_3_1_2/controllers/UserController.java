package com.skakundima.spring.boot.KataTask_3_1_2.controllers;

import com.skakundima.spring.boot.KataTask_3_1_2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping
    public String getUser(Principal principal, Model model) {
        model.addAttribute(userServiceImpl.findByFirstName(principal.getName()));
        return "one";
    }
}
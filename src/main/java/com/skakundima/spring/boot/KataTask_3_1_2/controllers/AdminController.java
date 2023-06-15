package com.skakundima.spring.boot.KataTask_3_1_2.controllers;

import com.skakundima.spring.boot.KataTask_3_1_2.entity.User;
import com.skakundima.spring.boot.KataTask_3_1_2.service.impl.RoleServiceImpl;
import com.skakundima.spring.boot.KataTask_3_1_2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/admin")
public class AdminController {
    private final UserServiceImpl userServiceImpl;
    private final RoleServiceImpl roleServiceImpl;
    @Autowired
    public AdminController(UserServiceImpl userServiceImpl, RoleServiceImpl roleServiceImpl) {
        this.userServiceImpl = userServiceImpl;
        this.roleServiceImpl = roleServiceImpl;
    }

    @GetMapping
    public String toUsers() {
        return "admin";
    }

    @GetMapping
    public String allUser(Model model) {
        model.addAttribute("users", userServiceImpl.findAllUsers());
        return "users";
    }

    @GetMapping("/new")
    public String newUser(Model model, @ModelAttribute("user") User user) {
        model.addAttribute("roles", roleServiceImpl.findAll());
        return "new";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam("id") Long id) {
        model.addAttribute("roles", roleServiceImpl.findAll());
        model.addAttribute("user", userServiceImpl.findById(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user) {
        userServiceImpl.update(user);
        return "redirect:/admin";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("user") User user) {
        userServiceImpl.add(user);
        return "redirect:/admin";
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable("id") Long id) {
        userServiceImpl.deleteById(id);
        return "redirect:/admin";
    }

}

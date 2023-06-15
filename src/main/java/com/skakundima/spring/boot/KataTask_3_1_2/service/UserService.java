package com.skakundima.spring.boot.KataTask_3_1_2.service;


import com.skakundima.spring.boot.KataTask_3_1_2.entity.User;

import java.util.List;

public interface UserService {
    User findByFirstName(String firstName);
    User findById(Long id);
    List<User> findAllUsers();
    void add(User user);
    void update(User user);
    void deleteById(Long id);
}

package com.skakundima.spring.boot.KataTask_3_1_2.services;


import com.skakundima.spring.boot.KataTask_3_1_2.models.User;

import java.util.List;

public interface UsersService {

    public List<User> findAll();

    public User findOne(Long id);
    public User findByEmail(String email);

    public void save(User user);

    public void delete(Long id);

    void update(User user);
}

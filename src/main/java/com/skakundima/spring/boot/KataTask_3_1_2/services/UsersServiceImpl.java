package com.skakundima.spring.boot.KataTask_3_1_2.services;

import com.skakundima.spring.boot.KataTask_3_1_2.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.skakundima.spring.boot.KataTask_3_1_2.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class UsersServiceImpl implements UsersService {

    UserDAO userDAO;

    public UsersServiceImpl() {
    }

    @Autowired
    public UsersServiceImpl (UserDAO userDao) {
        this.userDAO = userDao;
    }

    @Override
    public List<User> findAll() {

        return userDAO.findAll();
    }

    @Override
    public User findOne(Long id) {

        return userDAO.findOne(id);
    }

    @Override
    public User findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    @Override
    public void save(User user) {

        userDAO.save(user);
    }

    @Override
    public void delete(Long id) {

        userDAO.delete(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }
}

package com.skakundima.spring.boot.KataTask_3_1_2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

import javax.persistence.*;

import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.skakundima.spring.boot.KataTask_3_1_2.models.User;


import java.util.List;


@Repository
@Transactional(readOnly = true)
public class UserDaoImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findAll() {

        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User findOne(Long id) {

        return entityManager.find(User.class, id);
    }

    @Override
    public User findByEmail(String email) {

        TypedQuery<User> query = entityManager.createQuery("select u from User u where u.email= :email", User.class);

        query.setParameter("email", email);

        return query.getResultStream().findFirst().get();
    }

    @Override
    @Transactional
    public void save(User user) {

        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    @Transactional
    public void update(User user) {

        entityManager.merge(user);
    }
}

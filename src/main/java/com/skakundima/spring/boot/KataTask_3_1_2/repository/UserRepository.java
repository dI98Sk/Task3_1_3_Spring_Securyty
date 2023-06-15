package com.skakundima.spring.boot.KataTask_3_1_2.repository;

import com.skakundima.spring.boot.KataTask_3_1_2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByFirstName(String firstname);
}

package com.skakundima.spring.boot.KataTask_3_1_2.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;



@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 45)
    private String name;

//      ==== Конструкторы ===

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

//      ==== Геттеры и сеттеры ====

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString() {
        return this.name.replaceFirst("ROLE_", "");
    }




}

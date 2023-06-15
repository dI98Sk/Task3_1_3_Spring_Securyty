package com.skakundima.spring.boot.KataTask_3_1_2.service.impl;

import com.skakundima.spring.boot.KataTask_3_1_2.entity.Role;
import com.skakundima.spring.boot.KataTask_3_1_2.repository.RoleRepository;
import com.skakundima.spring.boot.KataTask_3_1_2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional(readOnly = true)
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

}

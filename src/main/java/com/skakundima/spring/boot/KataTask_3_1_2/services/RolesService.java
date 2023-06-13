package com.skakundima.spring.boot.KataTask_3_1_2.services;



import com.skakundima.spring.boot.KataTask_3_1_2.models.Role;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public interface RolesService {

    public List<Role> findAll();

    public Role findOne(Integer id);

    public HashSet<Role> findMultipleById(Collection<Integer> idCollection);

    public void save(Role role);

    public void delete(Integer id);

    void update(Role role);
}

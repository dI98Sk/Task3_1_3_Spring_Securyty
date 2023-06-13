package com.skakundima.spring.boot.KataTask_3_1_2.services;


import com.skakundima.spring.boot.KataTask_3_1_2.dao.RoleDAO;
import com.skakundima.spring.boot.KataTask_3_1_2.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Component
public class RolesServiceImpl implements RolesService {

    RoleDAO roleDAO;

    public RolesServiceImpl() {
    }

    @Autowired
    public RolesServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public List<Role> findAll() {

        return roleDAO.findAll();
    }

    @Override
    public Role findOne(Integer id) {

        return roleDAO.findOne(id);
    }

    @Override
    public HashSet<Role> findMultipleById(Collection<Integer> idCollection) {

        return roleDAO.findMultipleById(idCollection);
    }

    @Override
    public void save(Role role) {

        roleDAO.save(role);
    }

    @Override
    public void delete(Integer id) {

        roleDAO.delete(id);
    }

    @Override
    public void update(Role role) {

        roleDAO.update(role);
    }
}

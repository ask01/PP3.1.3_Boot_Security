package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    private RoleDao rolesDao;

    public RoleServiceImpl(RoleDao rolesDao) {
        this.rolesDao = rolesDao;
    }

    @Override
    public List<Role> getRoles() {
        return rolesDao.findAll();
    }
}

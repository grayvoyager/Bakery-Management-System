package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAllRoles();
    Role findByRoleType(String roleType);
    Role findByRoleId(Long id);
    void deleteById(Long id);



}

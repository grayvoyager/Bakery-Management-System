package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.Role;
import com.management.system.bakery.backend.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User findByName(String name);
    User findByUserId(Long id);
    void deleteByUserId(Long id);



}

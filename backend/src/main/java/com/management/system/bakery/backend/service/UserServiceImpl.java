package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.User;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("User with " + name + "not found!!"));
    }

    @Override
    public User findByUserId(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with " + id + "not found!!"));
    }

    @Override
    public void deleteByUserId(Long id) {
        userRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException("User with"+id+"couldn't be found!!"));

    }
}

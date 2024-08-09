package com.test.library_management_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.library_management_system.entity.User;
import com.test.library_management_system.repository.UserRepository;

public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}

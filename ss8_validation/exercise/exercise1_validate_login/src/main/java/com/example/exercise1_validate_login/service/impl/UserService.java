package com.example.exercise1_validate_login.service.impl;

import com.example.exercise1_validate_login.model.User;
import com.example.exercise1_validate_login.repository.IUserRepository;
import com.example.exercise1_validate_login.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        iUserRepository.save(user);
    }
}

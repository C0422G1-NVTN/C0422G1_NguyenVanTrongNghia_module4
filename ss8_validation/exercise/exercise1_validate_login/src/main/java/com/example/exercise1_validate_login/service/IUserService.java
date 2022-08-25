package com.example.exercise1_validate_login.service;

import com.example.exercise1_validate_login.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void saveUser(User user);
}

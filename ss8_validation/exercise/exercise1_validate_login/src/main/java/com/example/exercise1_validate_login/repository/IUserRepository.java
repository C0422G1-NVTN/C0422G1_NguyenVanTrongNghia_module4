package com.example.exercise1_validate_login.repository;

import com.example.exercise1_validate_login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {

}

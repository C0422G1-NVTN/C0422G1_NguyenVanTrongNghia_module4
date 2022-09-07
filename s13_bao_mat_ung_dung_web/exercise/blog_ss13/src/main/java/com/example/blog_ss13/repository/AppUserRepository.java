package com.example.blog_ss13.repository;

import com.example.blog_ss13.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findAllByUserName(String userName);
}

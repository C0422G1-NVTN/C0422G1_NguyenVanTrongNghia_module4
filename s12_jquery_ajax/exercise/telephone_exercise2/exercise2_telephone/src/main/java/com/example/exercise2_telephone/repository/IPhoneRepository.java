package com.example.exercise2_telephone.repository;

import com.example.exercise2_telephone.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepository extends JpaRepository<Phone, Integer> {
}

package com.example.exercise2_telephone.service;

import com.example.exercise2_telephone.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPhoneService {
    Page<Phone> findAll(Pageable pageable);

    Phone save(Phone phone);

    Phone findById(int id);

    void delete(int id);
}

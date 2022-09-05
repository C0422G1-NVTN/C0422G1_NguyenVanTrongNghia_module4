package com.example.exercise2_telephone.service.impl;

import com.example.exercise2_telephone.model.Phone;
import com.example.exercise2_telephone.repository.IPhoneRepository;
import com.example.exercise2_telephone.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhoneService implements IPhoneService {
    @Autowired
    private IPhoneRepository iPhoneRepository;

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return this.iPhoneRepository.findAll(pageable);
    }

    @Override
    public Phone save(Phone phone) {
        return this.iPhoneRepository.save(phone);
    }

    @Override
    public Phone findById(int id) {
        return this.iPhoneRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        this.iPhoneRepository.delete(findById(id));
    }
}
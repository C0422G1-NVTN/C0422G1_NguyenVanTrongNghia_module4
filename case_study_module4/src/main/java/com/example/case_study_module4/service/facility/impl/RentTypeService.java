package com.example.case_study_module4.service.facility.impl;

import com.example.case_study_module4.model.facility.RentType;
import com.example.case_study_module4.repository.facility.IRentTypeRepository;
import com.example.case_study_module4.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return this.iRentTypeRepository.findAll();
    }
}

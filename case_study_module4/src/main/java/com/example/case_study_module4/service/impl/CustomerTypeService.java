package com.example.case_study_module4.service.impl;

import com.example.case_study_module4.model.customer.CustomerType;
import com.example.case_study_module4.repository.ICustomerTypeRepository;
import com.example.case_study_module4.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return this.iCustomerTypeRepository.findAll();
    }
}

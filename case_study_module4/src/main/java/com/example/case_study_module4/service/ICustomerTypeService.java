package com.example.case_study_module4.service;

import com.example.case_study_module4.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}

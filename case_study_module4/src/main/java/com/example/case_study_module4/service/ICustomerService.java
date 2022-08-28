package com.example.case_study_module4.service;

import com.example.case_study_module4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    void save(Customer customer);

    Page<Customer> findAll(Pageable pageable);

    Customer findById(int id);

    void deleteById(int id);
}

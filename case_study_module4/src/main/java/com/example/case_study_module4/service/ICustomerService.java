package com.example.case_study_module4.service;

import com.example.case_study_module4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAllByNameContaining(String nameCustomer, Pageable pageable);

    void save(Customer customer);

    Customer findById(int id);

    void deleteById(int id);
}

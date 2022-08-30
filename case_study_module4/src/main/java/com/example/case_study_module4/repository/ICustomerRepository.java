package com.example.case_study_module4.repository;

import com.example.case_study_module4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAllByNameContaining(String nameFacility, Pageable pageable);

}

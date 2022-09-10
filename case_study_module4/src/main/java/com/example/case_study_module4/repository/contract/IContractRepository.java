package com.example.case_study_module4.repository.contract;

import com.example.case_study_module4.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contract,Integer> {

    Page<Contract> findByEndDate(String endDate, Pageable pageable);
}

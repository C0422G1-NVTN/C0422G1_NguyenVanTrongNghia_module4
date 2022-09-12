package com.example.case_study_module4.service.contract;

import com.example.case_study_module4.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface IContractService {
    Page<Contract> findByEndDate(LocalDate endDate, Pageable pageable);

}

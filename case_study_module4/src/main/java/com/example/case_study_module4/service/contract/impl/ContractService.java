package com.example.case_study_module4.service.contract.impl;

import com.example.case_study_module4.model.contract.Contract;
import com.example.case_study_module4.repository.contract.IContractRepository;
import com.example.case_study_module4.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ContractService implements IContractService {
@Autowired
private IContractRepository iContractRepository;

    @Override
    public Page<Contract> findByEndDate(LocalDate endDate, Pageable pageable) {
        return iContractRepository.findByEndDateGreaterThanEqual(endDate, pageable);
    }
}

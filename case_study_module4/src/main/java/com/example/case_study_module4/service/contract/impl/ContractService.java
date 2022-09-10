package com.example.case_study_module4.service.contract.impl;

import com.example.case_study_module4.model.contract.Contract;
import com.example.case_study_module4.repository.contract.IContractRepository;
import com.example.case_study_module4.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;


    @Override
    public Page<Contract> findAllByEndDayContaining(String endDate, Pageable pageable) {

        if (endDate == null || endDate.equals("")) {
            return this.findAll(pageable);
        }
        return iContractRepository.findByEndDate(endDate, pageable);
    }

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return iContractRepository.findAll(pageable);
    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public Contract findById(int id) {
        return iContractRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        iContractRepository.deleteById(id);
    }
}

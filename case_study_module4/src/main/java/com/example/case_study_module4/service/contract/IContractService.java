package com.example.case_study_module4.service.contract;

import com.example.case_study_module4.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAllByEndDayContaining(String endDate, Pageable pageable);

    Page<Contract> findAll(Pageable pageable);

    void save(Contract contract);

    Contract findById(int id);

    void deleteById(int id);
}

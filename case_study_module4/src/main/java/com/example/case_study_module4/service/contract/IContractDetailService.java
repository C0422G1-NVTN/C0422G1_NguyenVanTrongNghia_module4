package com.example.case_study_module4.service.contract;

import com.example.case_study_module4.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findByAllContractDetailById(Integer id);
}

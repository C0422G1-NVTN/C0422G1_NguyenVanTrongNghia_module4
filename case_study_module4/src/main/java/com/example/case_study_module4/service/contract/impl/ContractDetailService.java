package com.example.case_study_module4.service.contract.impl;

import com.example.case_study_module4.model.contract.ContractDetail;
import com.example.case_study_module4.repository.contract.IContractDetailRepository;
import com.example.case_study_module4.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Override
    public List<ContractDetail> findByAllContractDetailById(Integer id) {
        return iContractDetailRepository.findAllByContract_ContractId(id) ;
    }
}

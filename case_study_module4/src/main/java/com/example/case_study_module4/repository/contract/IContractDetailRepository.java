package com.example.case_study_module4.repository.contract;

import com.example.case_study_module4.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    List<ContractDetail> findAllByContract_ContractId(Integer id);
}

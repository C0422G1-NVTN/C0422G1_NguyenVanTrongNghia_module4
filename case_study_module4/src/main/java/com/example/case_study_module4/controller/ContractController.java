package com.example.case_study_module4.controller;


import com.example.case_study_module4.service.contract.IContractDetailService;
import com.example.case_study_module4.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;

    @Autowired
    private IContractDetailService iContractDetailService;

    @GetMapping("")
    public String goContract() {
        return "contract/list";
    }
}

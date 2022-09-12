package com.example.case_study_module4.controller;

import com.example.case_study_module4.model.contract.Contract;
import com.example.case_study_module4.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("restContract")
public class ContractRestController {
    @Autowired
    private IContractService iContractService;

    @GetMapping("")
    public ResponseEntity<Page<Contract>> getContracts(@PageableDefault(size = 5) Pageable pageable) {
        Page<Contract> contracts = iContractService.findByEndDate(LocalDate.now(), pageable);
        if (!contracts.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contracts, HttpStatus.OK);
    }
}

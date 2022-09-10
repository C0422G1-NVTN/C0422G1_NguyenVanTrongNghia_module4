package com.example.case_study_module4.controller;


import com.example.case_study_module4.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequestMapping("/contract")
@Controller
public class ContractController {
    @Autowired
    private IContractService iContractService;

    @GetMapping(value = {"/list",""})
    public String goListContract(Model model,
                                 @PageableDefault(size = 3) Pageable pageable,
                                 @RequestParam Optional<String> keyword){
        String keywordValue = keyword.orElse(null);
        model.addAttribute("contracts",
                this.iContractService.findAllByEndDayContaining(keywordValue,pageable));
        model.addAttribute("keywordValue",keywordValue);
        return "contract/list";
    }
}

package com.medical.controller;

import com.medical.model.Medical;
import com.medical.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MedicalController {
    @Autowired
    private IMedicalService iMedicalService;

    @GetMapping("/")
    public String goIndex(Model model) {
        List<String> genderList = iMedicalService.gender();
        List<String> nationList = iMedicalService.nation();
        List<String> vehicleList = iMedicalService.vehicle();
        List<Integer> dayList = iMedicalService.day();
        List<Integer> monthList = iMedicalService.month();
        List<Integer> yearList = iMedicalService.year();
        model.addAttribute("genderList", genderList);
        model.addAttribute("nationList", nationList);
        model.addAttribute("vehicleList", vehicleList);
        model.addAttribute("dayList", dayList);
        model.addAttribute("monthList", monthList);
        model.addAttribute("yearList", yearList);
        model.addAttribute("medical", new Medical());
        return "/index";
    }

    @GetMapping("/save")
    public String saveEmail(@ModelAttribute("listMedical") Medical medical, Model model) {
        List<Medical> medicalList;
        medicalList = iMedicalService.saveMedical(medical);
        model.addAttribute("medicalList", medicalList);
        return "/list";
    }
}

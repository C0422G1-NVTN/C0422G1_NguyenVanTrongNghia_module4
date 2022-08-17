package com.medical.controller;

import com.medical.model.Medical;
import com.medical.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MedicalController {
    @Autowired
    private IMedicalService iMedicalService;

    @GetMapping("/")
    public String goIndex(Model model) { //home
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
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Medical medical, RedirectAttributes redirectAttributes) {
        iMedicalService.saveMedical(medical);
        redirectAttributes.addFlashAttribute("mess", "Thêm thành công");
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", iMedicalService.findAllMedical());
        return "list";
    }

    @GetMapping("/showEdit")
    public String showEdit(@RequestParam int id, Model model) {
        List<String> genderList = iMedicalService.gender();
        List<String> nationList = iMedicalService.nation();
        List<String> vehicleList = iMedicalService.vehicle();
        List<Integer> dayList = iMedicalService.day();
        List<Integer> monthList = iMedicalService.month();
        List<Integer> yearList = iMedicalService.year();
        model.addAttribute("edit",iMedicalService.findId(id));
        model.addAttribute("genderList", genderList);
        model.addAttribute("nationList", nationList);
        model.addAttribute("vehicleList", vehicleList);
        model.addAttribute("dayList", dayList);
        model.addAttribute("monthList", monthList);
        model.addAttribute("yearList", yearList);
        model.addAttribute("medical", new Medical());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Medical medical, RedirectAttributes redirectAttributes) {
        iMedicalService.edit(medical);
        redirectAttributes.addFlashAttribute("mess", "Sửa thành công");
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iMedicalService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Xóa thành công");
        return "redirect:/list";
    }


}

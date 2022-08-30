package com.example.case_study_module4.controller;

import com.example.case_study_module4.model.customer.Customer;
import com.example.case_study_module4.service.ICustomerService;
import com.example.case_study_module4.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@RequestMapping("/customer")
@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping(value = {"/list", ""})
    public String goCustomerList(@PageableDefault(size = 3) Pageable pageable,
                                 @RequestParam Optional<String> keySearch,
                                 Model model) {

        String keyVal = keySearch.orElse("");

        model.addAttribute("customers",
                this.iCustomerService.findAllByNameContaining(keyVal, pageable));

        model.addAttribute("keySearch", keyVal);

        return "/customer/list";
    }

    @GetMapping("/create")
    public String goCreateForm(Model model) {

        model.addAttribute("customer", new Customer());

        model.addAttribute("customerTypeList",
                this.iCustomerTypeService.findAll());

        return "/customer/create";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute Customer customer,
                               RedirectAttributes redirectAttributes) {

        this.iCustomerService.save(customer);

        redirectAttributes.addFlashAttribute("message",
                "successfully added new");

        return "redirect:/customer/home";
    }

    @GetMapping("/edit")
    public String goEditForm(@RequestParam int id,
                             Model model) {

        model.addAttribute("customer",
                this.iCustomerService.findById(id));

        model.addAttribute("customerTypeList",
                this.iCustomerTypeService.findAll());

        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String updateCustomer(@ModelAttribute Customer customer,
                                 RedirectAttributes redirectAttributes) {

        this.iCustomerService.save(customer);

        redirectAttributes.addFlashAttribute("message",
                "successfully update");

        return "redirect:/customer";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam int customerId) {

        this.iCustomerService.deleteById(customerId);

        return "redirect:/customer/home";
    }
}

package com.mailbox.controller;

import com.mailbox.model.Email;
import com.mailbox.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class EmailController {
    @Autowired
    private IMailService iMailService;

    @GetMapping("/")
    public String goIndex(Model model) {
        List<String> languageList = iMailService.displayLanguages();
        List<Integer> sizeList = iMailService.displaySize();
        model.addAttribute("languageList", languageList);
        model.addAttribute("sizeList", sizeList);
        model.addAttribute("email", new Email());
        return "/index";
    }

    @GetMapping("/save")
    public String saveEmail(@ModelAttribute("listEmail") Email email, Model model) {
        List<Email> emailList;
        emailList = iMailService.saveEmail(email);
        model.addAttribute("emailList", emailList);
        return "/list";
    }
}

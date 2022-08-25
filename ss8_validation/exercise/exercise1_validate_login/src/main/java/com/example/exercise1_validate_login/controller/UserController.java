package com.example.exercise1_validate_login.controller;

import com.example.exercise1_validate_login.dto.UserDto;
import com.example.exercise1_validate_login.model.User;
import com.example.exercise1_validate_login.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("userList", this.iUserService.findAll());
        return "/list";
    }

    @GetMapping("/showAdd")
    public String showAdd(Model model) {
        model.addAttribute("user", new UserDto());
        return "/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("user") @Valid UserDto userDto,
                      BindingResult bindingResult,
                      RedirectAttributes redirectAttributes) {
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "/add";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        this.iUserService.saveUser(user);
        redirectAttributes.addFlashAttribute("message", "Đăng kí thành công!!!");
        return "redirect:/";
    }
}

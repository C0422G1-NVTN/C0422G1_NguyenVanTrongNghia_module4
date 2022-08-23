package com.blog.blog123.controller;

import com.blog.blog123.model.Blog;
import com.blog.blog123.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/")
    public String goHome(Model model) {
        model.addAttribute("blogList", iBlogService.findAll());
        return "/home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Blog blog) {
        iBlogService.writeNewBlog(blog);
        return "redirect:/";
    }

    @GetMapping("/showUpdate")
    public String showUpdate(Model model, @RequestParam int id) {
        model.addAttribute("blog", this.iBlogService.findBlogById(id));
        return "/create";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.writeNewBlog(blog);
        return "redirect:/";
    }

    @GetMapping("/details")
    public String showDetailsProduct(@RequestParam int id, Model model) {
        model.addAttribute("blog", this.iBlogService.findBlogById(id));
        return "/details";
    }

    @PostMapping("/delete")
    public String deleteProduct(@RequestParam int idDelete, RedirectAttributes redirectAttributes) {
        this.iBlogService.deleteBlog(idDelete);
        redirectAttributes.addFlashAttribute("msg",
                "Đã xoá thành công");
        return "redirect:/";
    }
}

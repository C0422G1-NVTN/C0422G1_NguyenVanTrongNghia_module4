package com.product.controller;

import com.product.model.Product;
import com.product.service.IProductService;
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
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String list(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("productList", productList);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/save")
    public String save(Product product) {
        iProductService.save(product);
        return "redirect:/";
    }

    @GetMapping("/details")
    public String showDetailsProduct(@RequestParam int id, Model model) {
        Product product = iProductService.findById(id);
        model.addAttribute("product", product);
        return "details";
    }

    @GetMapping("/update")
    public String showFormUpdateProduct(@RequestParam int id, Model model) {
        Product product = this.iProductService.findById(id);
        model.addAttribute("product", product);
        return "edit";
    }

    @PostMapping("/update")
    public String updateProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        this.iProductService.update(product);
        redirectAttributes.addFlashAttribute("msg",
                "Đã chỉnh sửa thành công");
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteProduct(@RequestParam int idDelete, RedirectAttributes redirectAttributes) {
        this.iProductService.remove(idDelete);
        redirectAttributes.addFlashAttribute("msg",
                "Đã xoá thành công");
        return "redirect:/";
    }

    @GetMapping("/search")
    public String searchProductByName(@RequestParam String productName, Model model) {
        List<Product> products = iProductService.findByName(productName);
        model.addAttribute("productList", products);
        return "list";
    }

}

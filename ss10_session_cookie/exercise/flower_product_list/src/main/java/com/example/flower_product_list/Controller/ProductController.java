package com.example.flower_product_list.Controller;

import com.example.flower_product_list.model.Product;
import com.example.flower_product_list.service.ICartService;
import com.example.flower_product_list.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SessionAttributes("cart")
@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @Autowired
    private ICartService iCartService;

    @GetMapping("")
    public String goProductList() {
        return "/shop";
    }

    @ModelAttribute("cart")
    public Map<Product, Integer> cart() {
        return new HashMap<>();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", iProductService.findAll());
        return modelAndView;
    }

    @GetMapping("/detail")
    public String goDetail(@RequestParam Long id, Model model) {
        Product product = iProductService.findById(id).orElse(null);
        if (product == null) {
            return "/error.404";
        }
        model.addAttribute("product", product);
        return "/details";
    }

    @GetMapping(value = {"/add"})
    public String addToCart(@RequestParam(defaultValue = "0") Long id, String expression, Model model, @SessionAttribute Map<Product, Integer> cart) {
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        iCartService.changeCart(cart, id, expression);
        model.addAttribute("total", iCartService.total(cart));
        model.addAttribute("cart", cart);
        return "/cart";
    }

    @GetMapping("/remove")
    public String removeToCart(@SessionAttribute Map<Product, Integer> cart, @RequestParam Long id, Model model) {
        Product product = iProductService.findById(id).orElse(null);
        cart.remove(product);
        model.addAttribute("total", iCartService.total(cart));
        model.addAttribute("cart", cart);
        return "/cart";
    }

}

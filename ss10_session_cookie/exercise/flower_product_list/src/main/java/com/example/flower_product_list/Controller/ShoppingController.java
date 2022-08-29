package com.example.flower_product_list.Controller;

import com.example.flower_product_list.model.Product;
import com.example.flower_product_list.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Map;

@Controller
public class ShoppingController {
    @Autowired
    private ICartService iCartService;
    @GetMapping("/shopping-cart")
    public  String goCart(Model model, @SessionAttribute Map<Product, Integer> cart){
        model.addAttribute("cart",cart);
        model.addAttribute("total", iCartService.total(cart));
        return "cart";
    }
}

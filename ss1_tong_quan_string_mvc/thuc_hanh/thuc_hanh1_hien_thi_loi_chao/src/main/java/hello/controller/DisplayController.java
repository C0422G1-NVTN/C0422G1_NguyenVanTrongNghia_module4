package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DisplayController {

    @GetMapping("/")
    public String display() {
        return "/display";
    }

    @PostMapping("/displayHello")
    public String displayHello(@RequestParam String keyChar, Model model) {
        String result = "hello " + keyChar;
        model.addAttribute("result", result);
        return "/display";
    }
}

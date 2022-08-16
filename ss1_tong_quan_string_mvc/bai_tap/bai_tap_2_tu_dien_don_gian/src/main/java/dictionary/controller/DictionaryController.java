package dictionary.controller;

import dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping("/")
    public String dictionary() {
        return "/dictionary";
    }

    @PostMapping("/search")
    public String search(@RequestParam String keySearch, Model model) {
        String result = iDictionaryService.findByName(keySearch);
        model.addAttribute("result", result);
        return "/dictionary";
    }
}

package com.huy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private DataService dataService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("datas", dataService.findAll());
        return "index";
    }
}

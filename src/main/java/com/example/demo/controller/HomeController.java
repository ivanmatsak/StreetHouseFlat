package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping(value = "/welcome")
    public String welcome(Model model){
        String name = "Ivan";
        model.addAttribute("name", name);
        return "home";
    }
}

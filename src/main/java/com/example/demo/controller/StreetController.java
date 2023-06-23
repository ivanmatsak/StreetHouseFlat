package com.example.demo.controller;

import com.example.demo.model.Street;
import com.example.demo.service.StreetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StreetController {
    @Autowired
    private StreetService streetService;

    @Autowired
    public StreetController(StreetService streetService) {
        this.streetService = streetService;
    }


    @GetMapping("/streets")
    public String findAll(Model model){
        List<Street> streets = streetService.findAll();
        model.addAttribute("streets", streets);
        return "street-list";
    }

    @GetMapping("/street-create")
    public String createStreetForm(Street street){
        return "street-create";
    }

    @PostMapping("/street-create")
    public String createStreet(Street street){
        streetService.saveStreet(street);
        return "redirect:/streets";
    }

    @GetMapping("street-delete/{id}")
    public String deleteStreet(@PathVariable("id") Long id){
        streetService.deleteById(id);
        return "redirect:/streets";
    }

    @GetMapping("/street-update/{id}")
    public String updateStreetForm(@PathVariable("id") Long id, Model model){
        Street street = streetService.findById(id);
        model.addAttribute("street", street);
        return "street-update";
    }

    @PostMapping("/street-update")
    public String updateStreet(Street street){
        streetService.saveStreet(street);
        return "redirect:/streets";
    }
}
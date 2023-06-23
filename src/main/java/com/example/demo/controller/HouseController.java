package com.example.demo.controller;

import com.example.demo.model.House;
import com.example.demo.model.Street;
import com.example.demo.service.HouseService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HouseController {

    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/houses")
    public String findAll(Model model){
        List<House> houses = houseService.findAll();
        model.addAttribute("houses", houses);
        return "house-list";
    }

    @GetMapping("/house-create")
    public String createHouseForm(House house){
        return "house-create";
    }

    @PostMapping("/house-create")
    public String createHouse(House house){
        houseService.saveHouse(house);
        return "redirect:/houses";
    }

    @GetMapping("house-delete/{id}")
    public String deleteHouse(@PathVariable("id") Long id){
        houseService.deleteById(id);
        return "redirect:/houses";
    }

    @GetMapping("/house-update/{id}")
    public String updateHouseForm(@PathVariable("id") Long id, Model model){
        House house = houseService.findById(id);
        model.addAttribute("house", house);
        return "house-update";
    }

    @PostMapping("/house-update")
    public String updateHouse(House house){
        houseService.saveHouse(house);
        return "redirect:/houses";
    }
}
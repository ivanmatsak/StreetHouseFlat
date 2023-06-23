package com.example.demo.controller;

import com.example.demo.model.Flat;
import com.example.demo.model.House;
import com.example.demo.model.Street;
import com.example.demo.service.FlatService;
import com.example.demo.service.HouseService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FlatController {

    private final FlatService flatService;

    @Autowired
    public FlatController(FlatService flatService) {
        this.flatService = flatService;
    }

    @GetMapping("/flats")
    public String findAll(Model model){
        List<Flat> flats = flatService.findAll();
        model.addAttribute("flats", flats);
        return "flat-list";
    }

    @GetMapping("/flat-create")
    public String createFlatForm(Flat flat){
        return "flat-create";
    }

    @PostMapping("/flat-create")
    public String createFlat(Flat flat){
        flatService.saveHouse(flat);
        return "redirect:/flats";
    }

    @GetMapping("flat-delete/{id}")
    public String deleteFlat(@PathVariable("id") Long id){
        flatService.deleteById(id);
        return "redirect:/flats";
    }

    @GetMapping("/flat-update/{id}")
    public String updateFlatForm(@PathVariable("id") Long id, Model model){
        Flat flat = flatService.findById(id);
        model.addAttribute("flat", flat);
        return "flat-update";
    }

    @PostMapping("/flat-update")
    public String updateFlat(Flat flat){
        flatService.saveHouse(flat);
        return "redirect:/flats";
    }
}
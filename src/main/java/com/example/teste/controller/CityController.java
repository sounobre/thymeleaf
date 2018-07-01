/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.teste.controller;


import com.example.teste.model.City;
import com.example.teste.repository.CityRepository;
import javax.persistence.PostLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author souno
 */
@Controller
@RequestMapping("cities")
public class CityController {
    
    @Autowired
    private CityRepository cityRepository;
    
    public CityController(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }
    
    @GetMapping
    public String index(Model model){
        model.addAttribute("cities", this.cityRepository.findAll());
        return "cities/index";
    }
    
    @PostMapping
    public String create(@ModelAttribute("city") City city, Model model){
      this.cityRepository.save(city);
        return "redirect:/cities";
    }
    
    @GetMapping("/new")
    public String newCity(Model model) {
        model.addAttribute("city", new City());
        return "cities/new";
    }
    
    @GetMapping("/{id}")
    public String editCity(@PathVariable("id") Long id, Model model) {
        return "cities/edit";
    }
}

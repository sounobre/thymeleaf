package com.example.teste.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InicioController {
    
    @GetMapping("/new")
	public String newPath(Model model) {
		      List<String> list = new ArrayList<String>();
		
		list.add("Teste 1");
		list.add("Teste 2");
		list.add("Teste 3");
		list.add("Teste 4");
		list.add("Teste 5");
                
		model.addAttribute("list", list);
		
		return "new";
	}
    
}

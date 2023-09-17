package com.br.cineshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.cineshow.model.Sala;
import com.br.cineshow.service.SalaService;

import jakarta.validation.Valid;

@Controller
public class CadastroSalaController {
    
    @Autowired
    private SalaService salaService;

    @GetMapping("/cadastroSala")
    public String cadastroSala(Sala sala) {
        return "CadastroSala";
    }

    @PostMapping("/cadastroSala")
    public String novo(@Valid Sala sala, BindingResult result) {

        
        if(result.hasFieldErrors()) {
            return "redirect:/cadastroSala";
        }
        
        salaService.save(sala);

        return "redirect:/pesquisaSala";
    }
}

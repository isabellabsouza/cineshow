package com.br.cineshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.cineshow.model.Sessao;
import com.br.cineshow.service.SessaoService;

@Controller
public class PesquisaIngressoController {
    
    @Autowired
    private SessaoService sessaoService;


    @GetMapping("/pesquisaIngresso")
    public String pesquisaIngresso(Model model){

        List<Sessao> sessoes = sessaoService.findAll();
        model.addAttribute("sessoes", sessoes);
        return "PesquisaIngresso";
    }
}

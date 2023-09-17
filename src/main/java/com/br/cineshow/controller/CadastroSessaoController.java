package com.br.cineshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.cineshow.model.Filme;
import com.br.cineshow.model.Sala;
import com.br.cineshow.model.Sessao;
import com.br.cineshow.service.FilmeService;
import com.br.cineshow.service.SalaService;
import com.br.cineshow.service.SessaoService;

import jakarta.validation.Valid;

@Controller
public class CadastroSessaoController {
    
    @Autowired
    private SessaoService sessaoService;

    @Autowired
    private FilmeService filmeService;

    @Autowired
    private SalaService salaService;

    @GetMapping("/cadastroSessao")
    public String cadastroSessao(Sessao sessao, Model model){

        List<Filme> filmes = filmeService.findAllAtivos();
        model.addAttribute("filmesTitulosAtivos", filmes);

        List<Sala> salas = salaService.findAll();
        model.addAttribute("salasNomes", salas);

        return "CadastroSessao";
    }

    @PostMapping("/cadastroSessao")
    public String novo(@Valid Sessao sessao, BindingResult result){
        
        if(result.hasFieldErrors()) {
            return "redirect:/cadastroSessao";
        }
        
        sessaoService.save(sessao);

        return "redirect:/pesquisaSessao";
    }
}

package com.br.cineshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.cineshow.model.Cliente;
import com.br.cineshow.model.Ingresso;
import com.br.cineshow.model.Sessao;
import com.br.cineshow.service.ClienteService;
import com.br.cineshow.service.IngressoService;
import com.br.cineshow.service.SessaoService;

import jakarta.validation.Valid;

@Controller
public class VendaIngressoController {
    
     @Autowired
    private IngressoService ingressoService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private SessaoService sessaoService;

    private Sessao sessaoSelecionada;

    //@PathVariable(value="sessao_id") Long id

    @GetMapping("/vendaIngresso/{id}")
    public String cadastroIngresso(Ingresso ingresso, Model model, @PathVariable(value="id") long id){

        List<Cliente> clientes = clienteService.findAll();
        model.addAttribute("clientes", clientes);

        sessaoSelecionada = sessaoService.findById(id);
        return "VendaIngresso";
    }

    @PostMapping("/vendaIngresso/{id}")
    public String novo(@Valid Ingresso ingresso, BindingResult result){

        ingresso.setValido(true);
        ingresso.setSessao(sessaoSelecionada);
        ingressoService.save(ingresso);

        return "redirect:/pesquisaIngresso";
    }
}

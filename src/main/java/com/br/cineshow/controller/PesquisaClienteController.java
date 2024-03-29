package com.br.cineshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.cineshow.model.Cliente;
import com.br.cineshow.service.ClienteService;

import jakarta.validation.Valid;

@Controller
public class PesquisaClienteController {
    
@Autowired
    private ClienteService clienteService;

    @GetMapping("/pesquisaCliente")
    public String pesquisaCliente(Model model) {

        List<Cliente> clientes = clienteService.findAll();
        model.addAttribute("clientes", clientes);
        return "PesquisaCliente";
    }

    @GetMapping("/editarCliente/{id}")
    public String editarCliente(@PathVariable(value="id") Long id, Model model) {

        Cliente cliente = clienteService.findById(id);
        model.addAttribute("cliente", cliente);
        return "AtualizaCliente";
    }

    //salva edicao
    @PostMapping("/editarCliente/{id}")
    public String editarCliente(@PathVariable(name = "id") Long id,@Valid Cliente cliente, BindingResult result) {

        if(result.hasFieldErrors()) {
            return "redirect:/editarCliente/{id}";
        }
        
        
        clienteService.save(cliente);
        return "redirect:/pesquisaCliente";
    }

    //exclui cliente
    @GetMapping("excluirCliente/{id}")
    @CacheEvict(value = "clientes", allEntries = true)
    public String excluirCliente(@PathVariable(name = "id") Long id, Model model) {

        try {
            Cliente cliente = clienteService.findById(id);
            clienteService.delete(cliente);
        } catch (Exception e) {
            model.addAttribute("mensagem", "Cliente não pode ser excluído, pois está vinculado a uma sessão.");
        }

        return "redirect:/pesquisaCliente";
    }
}

package com.br.cineshow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cineshow.model.Cliente;
import com.br.cineshow.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public void save(Cliente cliente){
        this.clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){
        return this.clienteRepository.findAll();
    }

    public Cliente findById(long id){
        Cliente c = this.clienteRepository.findById(id);
        return c;
    }

    public void delete(Cliente cliente){
        this.clienteRepository.delete(cliente);
    }
}

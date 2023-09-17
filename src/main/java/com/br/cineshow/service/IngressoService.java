package com.br.cineshow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cineshow.model.Ingresso;
import com.br.cineshow.repository.IngressoRepository;

@Service
public class IngressoService {
    
    @Autowired
    private IngressoRepository ingressoRepository;

    public void save(Ingresso ingresso){
        this.ingressoRepository.save(ingresso);
    }

    public List<Ingresso> findAll(){
        return this.ingressoRepository.findAll();
    }
}

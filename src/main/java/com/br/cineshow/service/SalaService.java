package com.br.cineshow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cineshow.model.Sala;
import com.br.cineshow.repository.SalaRepository;

@Service
public class SalaService {
    
    @Autowired
    private SalaRepository salaRepository;

    public void save(Sala sala){
        this.salaRepository.save(sala);
    }

    public List<Sala> findAll(){
        return this.salaRepository.findAll();
    }

    public Sala findById(Long id){
        return this.salaRepository.findById(id).orElse(null);
    }
    
    public void delete(Sala sala){
        this.salaRepository.delete(sala);
    }
    
    public List<String> findAllNomes(){
        return this.salaRepository.findAllNomes();
    }
}

package com.br.cineshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cineshow.model.Ingresso;

@Repository
public interface IngressoRepository extends JpaRepository<Ingresso, Long>{
    
    
}

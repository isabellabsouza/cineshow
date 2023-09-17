package com.br.cineshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cineshow.model.Sessao;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long>{
    
    Sessao findById(long id);
}

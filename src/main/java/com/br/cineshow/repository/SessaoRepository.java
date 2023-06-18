package com.br.cineshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cineshow.model.Sessao;

public interface SessaoRepository extends JpaRepository<Sessao, Long>{

        Sessao findById(long id);

}

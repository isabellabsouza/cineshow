package com.br.cineshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cineshow.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Cliente findById(long id);
    
}

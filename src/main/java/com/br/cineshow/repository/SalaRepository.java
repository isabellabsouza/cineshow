package com.br.cineshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.cineshow.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long>{
    
    Sala findById(long id);

    @Query(name = "Sala.findAllNomes")
    List<String> findAllNomes();
}

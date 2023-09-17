package com.br.cineshow.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Future;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sessao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Filme filme;

    @OneToOne(cascade = CascadeType.ALL)
    private Sala sala;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="sessao", fetch = FetchType.EAGER)
    private List<Ingresso> ingresso;

    private double valorIngresso;

    @Future
    private LocalDateTime dataHora;

}

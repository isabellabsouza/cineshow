package com.br.cineshow.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ingresso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @AssertTrue
    private boolean valido;

    @NotNull
    private boolean meiaEntrada;

    @OneToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    @ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="codigo_sessao")
    private Sessao sessao;
}

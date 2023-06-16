package com.br.cineshow.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Filme {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataLancamento;

    @NotNull
    private boolean ativo;

    @Enumerated(EnumType.STRING)
    private ClassificacaoIndicativa classificacaoIndicativa;

    @Positive
    private int duracao;

    @NotBlank
    private String urlCartaz;
    
}

package com.cinema.filmestore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb01_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filme_id")
    private Long filmeId;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @Column(name = "enredo")
    private String enredo;

    @Column(name = "sinopse")
    private String sinopose;

    @Column(name = "ano_lancamento")
    private Integer anoLancamento;

    @Column(name = "imdb")
    private Double imdb;

    @Column(name = "classificacao_indicativa")
    private Integer classificacaoIndicativa;

}

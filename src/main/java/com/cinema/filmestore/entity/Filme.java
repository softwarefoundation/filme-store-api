package com.cinema.filmestore.entity;

import lombok.Data;

@Data
public class Filme {

    private String titulo;
    private String enredo;
    private String sinopose;
    private Integer anoLancamento;
    private Double imdb;
    private Integer classificacaoIndicativa;

}

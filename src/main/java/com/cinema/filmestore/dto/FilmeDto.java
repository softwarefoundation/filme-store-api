package com.cinema.filmestore.dto;

import lombok.Data;

@Data
public class FilmeDto {

    private Long filmeId;
    private String titulo;
    private String enredo;
    private String sinopose;
    private Integer anoLancamento;
    private Double imdb;
    private Integer classificacaoIndicativa;

}

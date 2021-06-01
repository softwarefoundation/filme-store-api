package com.cinema.filmestore.dto;

import com.cinema.filmestore.entity.Filme;
import com.cinema.filmestore.util.converter.ToEntity;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class FilmeDto implements ToEntity<Filme> {

    private Long filmeId;
    private String titulo;
    private String enredo;
    private String sinopose;
    private Integer anoLancamento;
    private Double imdb;
    private Integer classificacaoIndicativa;

    @Override
    public Filme toEntity() {
        return new ModelMapper().map(this, Filme.class);
    }
}

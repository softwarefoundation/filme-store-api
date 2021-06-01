package com.cinema.filmestore.entity;

import com.cinema.filmestore.dto.FilmeDto;
import com.cinema.filmestore.util.converter.ToDto;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb01_filme")
public class Filme implements ToDto<FilmeDto> {

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

    @Override
    public FilmeDto toDto() {
        return new ModelMapper().map(this,FilmeDto.class);
    }
}

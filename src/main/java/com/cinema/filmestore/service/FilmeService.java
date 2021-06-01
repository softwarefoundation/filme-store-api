package com.cinema.filmestore.service;

import com.cinema.filmestore.dto.FilmeDto;

import java.util.List;

public interface FilmeService {

    FilmeDto salvarFilme(FilmeDto filmeDto);

    FilmeDto buscarFilmePorId(Long filmeId);

    void deletarFilme(FilmeDto filmeDto);

    List<FilmeDto> listarTodosFilmes();

}

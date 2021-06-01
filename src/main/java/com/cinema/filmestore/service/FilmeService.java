package com.cinema.filmestore.service;

import com.cinema.filmestore.dto.FilmeDto;
import com.cinema.filmestore.entity.Filme;

public interface FilmeService {

    FilmeDto salvarFilme(FilmeDto filmeDto);

}

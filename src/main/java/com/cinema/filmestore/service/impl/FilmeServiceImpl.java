package com.cinema.filmestore.service.impl;

import com.cinema.filmestore.dto.FilmeDto;
import com.cinema.filmestore.entity.Filme;
import com.cinema.filmestore.repository.FilmeRepository;
import com.cinema.filmestore.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public FilmeDto salvarFilme(FilmeDto filmeDto) {
        Filme filme = filmeRepository.save(filmeDto.toEntity());
        return filme.toDto();
    }
}

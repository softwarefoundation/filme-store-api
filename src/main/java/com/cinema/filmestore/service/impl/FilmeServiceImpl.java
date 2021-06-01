package com.cinema.filmestore.service.impl;

import com.cinema.filmestore.dto.FilmeDto;
import com.cinema.filmestore.entity.Filme;
import com.cinema.filmestore.repository.FilmeRepository;
import com.cinema.filmestore.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public FilmeDto salvarFilme(FilmeDto filmeDto) {
        Filme filme = filmeRepository.save(filmeDto.toEntity());
        return filme.toDto();
    }

    @Override
    public FilmeDto buscarFilmePorId(Long filmeId) {
        Filme filme = filmeRepository.getById(filmeId);
        Assert.notNull(filme,"Filme não encontrado");
        return filme.toDto();
    }

    @Override
    public void deletarFilme(FilmeDto filmeDto) {
        FilmeDto filmeRetorno = buscarFilmePorId(filmeDto.getFilmeId());
        filmeRepository.delete(filmeRetorno.toEntity());
    }

    @Override
    public List<FilmeDto> listarTodosFilmes() {
        List<Filme> filmes = filmeRepository.findAll();
        return filmes.stream().map(f -> f.toDto()).collect(Collectors.toList());
    }
}

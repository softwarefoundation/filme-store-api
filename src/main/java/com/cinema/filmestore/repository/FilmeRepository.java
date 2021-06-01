package com.cinema.filmestore.repository;

import com.cinema.filmestore.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}

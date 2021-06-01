package com.cinema.filmestore.resource;

import com.cinema.filmestore.dto.FilmeDto;
import com.cinema.filmestore.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService filmeService;

    @PostMapping
    public ResponseEntity<?> salvarFilme(@RequestBody FilmeDto filmeDto){
       FilmeDto filme = filmeService.salvarFilme(filmeDto);
       return ResponseEntity.ok(filme);
    }

}

package com.cinema.filmestore.resource;

import com.cinema.filmestore.dto.FilmeDto;
import com.cinema.filmestore.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/{filmeId}")
    public ResponseEntity<?> pesquisarFilmePorId(@PathVariable Long filmeId){
        FilmeDto filmeDto = filmeService.buscarFilmePorId(filmeId);
        return ResponseEntity.ok(filmeDto);
    }

    @GetMapping("/todos")
    public ResponseEntity<?> listarTodosFilmes(){
        List<FilmeDto> filmesDto = filmeService.listarTodosFilmes();
        return ResponseEntity.ok(filmesDto);
    }

    @DeleteMapping
    public void deletarFilme(@RequestParam Long filmeId){
        FilmeDto filmeDto = new FilmeDto();
        filmeDto.setFilmeId(filmeId);
        filmeService.deletarFilme(filmeDto);
    }


}

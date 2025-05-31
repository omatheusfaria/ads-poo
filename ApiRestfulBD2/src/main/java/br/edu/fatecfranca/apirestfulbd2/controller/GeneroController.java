package br.edu.fatecfranca.apirestfulbd2.controller;

import br.edu.fatecfranca.apirestfulbd2.model.Genero;
import br.edu.fatecfranca.apirestfulbd2.model.Livro;
import br.edu.fatecfranca.apirestfulbd2.service.GeneroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    GeneroService generoService;
    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }
    @GetMapping
    public List<Genero> getGeneros(){
        return generoService.getGeneros();
    }
    @PostMapping
    public Genero addGenero(@RequestBody Genero genero) {
        return generoService.addGenero(genero);
    }
}
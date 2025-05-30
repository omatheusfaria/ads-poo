package br.edu.fatecfranca.apirestfulexe.controller;

import br.edu.fatecfranca.apirestfulexe.model.Filme;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {
    List<Filme> filmes =  new ArrayList<>();

    @GetMapping
    public List<Filme> getFilmes() {
        return this.filmes;
    }

    @PostMapping
    public Filme addFilme(@RequestBody Filme filme) {
        this.filmes.add(filme);
        return filme;
    }

    @DeleteMapping("/{id}")
    public String deleteFilme(@PathVariable Long id) {
        boolean resp = this.filmes.removeIf(filme -> filme.getId() == id);
        if(resp){
            return "Filme removido com sucesso!";
        }
        else {
            return "Filme nao encontrado";
        }
    }

    @PutMapping("/{id}")
    public Filme updateFilme(@PathVariable Long id, @RequestBody Filme novo) {
        for(Filme filme : this.filmes){
            if(filme.getId() == id){
                filme.setTitulo(novo.getTitulo());
                filme.setDiretor(novo.getDiretor());
                filme.setAno(novo.getAno());
                filme.setNota(novo.getNota());
                return filme;
            }
        }
        return null;
    }
}

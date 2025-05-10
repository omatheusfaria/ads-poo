package br.edu.fatecfranca.apirestfullista.controller;

import br.edu.fatecfranca.apirestfullista.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //Indica que a classe recebe e responde requisição REST
@RequestMapping("/livro") //Recebe e responde o endpoint /livro
public class LivroController {
    //banco de dados em memoria
    List<Livro> livros = new ArrayList<>();
    @GetMapping //Método responde requisição GET
    public List<Livro> getLivros(){
        return this.livros;//Retorna vetor com os livros
    }
    @PostMapping//Método responde requisição POST
    public Livro addLivro(@RequestBody Livro livro){
        this.livros.add(livro);
        return livro;
    }
}

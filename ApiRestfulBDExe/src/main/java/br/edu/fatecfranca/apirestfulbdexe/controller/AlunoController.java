package br.edu.fatecfranca.apirestfulbdexe.controller;

import br.edu.fatecfranca.apirestfulbdexe.model.Aluno;
import br.edu.fatecfranca.apirestfulbdexe.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    AlunoService alunoService;
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> getAlunos(){
        return alunoService.getAlunos();
    }

    @PostMapping
    public Aluno addAluno(@RequestBody Aluno aluno) {
        return alunoService.addAluno(aluno);
    }

    @DeleteMapping("/{id}")
    public String removeAluno(@PathVariable Long id){
        return alunoService.removeAluno(id);
    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.updateAluno(id, aluno);
    }

}

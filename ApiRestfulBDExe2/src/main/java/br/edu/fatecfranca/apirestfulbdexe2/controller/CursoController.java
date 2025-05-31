package br.edu.fatecfranca.apirestfulbdexe2.controller;

import br.edu.fatecfranca.apirestfulbdexe2.model.Curso;
import br.edu.fatecfranca.apirestfulbdexe2.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    CursoService cursoService;
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }

    @PostMapping
    public Curso addCurso(@RequestBody Curso curso){
        return cursoService.addCurso(curso);
    }

    @DeleteMapping("/{id}")
    public String deleteCurso(@PathVariable Long id){
        return cursoService.deleteCurso(id);
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Long id, @RequestBody Curso curso){
        return cursoService.updateCurso(id, curso);
    }
}

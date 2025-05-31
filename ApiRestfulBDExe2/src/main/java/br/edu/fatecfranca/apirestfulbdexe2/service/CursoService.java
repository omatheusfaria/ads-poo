package br.edu.fatecfranca.apirestfulbdexe2.service;

import br.edu.fatecfranca.apirestfulbdexe2.model.Curso;
import br.edu.fatecfranca.apirestfulbdexe2.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    CursoRepository cursoRepository;
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> getCursos(){
        return cursoRepository.findAll();
    }

    public Curso addCurso(Curso curso){
        return cursoRepository.save(curso);
    }

    public String deleteCurso(Long id){
        if(cursoRepository.existsById(id)){
            cursoRepository.deleteById(id);
            return "Curso removido com sucesso";
        }
        return "Curso não encontrado";
    }

    public Curso updateCurso(Long id, Curso curso){
        Curso recuperado = cursoRepository.findById(id).orElse(null);
        if(recuperado != null){
            recuperado.setNome(curso.getNome());
            recuperado.setArea(curso.getArea());
            return cursoRepository.save(recuperado);
        }
        return null;
    }
}

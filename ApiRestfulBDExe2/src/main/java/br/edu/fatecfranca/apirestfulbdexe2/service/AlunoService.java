package br.edu.fatecfranca.apirestfulbdexe2.service;

import br.edu.fatecfranca.apirestfulbdexe2.model.Aluno;
import br.edu.fatecfranca.apirestfulbdexe2.model.Curso;
import br.edu.fatecfranca.apirestfulbdexe2.repository.AlunoRepository;
import br.edu.fatecfranca.apirestfulbdexe2.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    AlunoRepository alunoRepository;
    CursoRepository cursoRepository;
    public AlunoService(AlunoRepository alunoRepository, CursoRepository cursoRepository) {
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
    }

    public List<Aluno> getAlunos(){
        return alunoRepository.findAll();
    }

    public Aluno addAluno(Aluno aluno){
        Curso aux = cursoRepository.findById(aluno.getCurso().getId()).orElse(null);
        if(aux != null){
            aluno.setCurso(aux);
            return alunoRepository.save(aluno);
        }
        return null;
    }

    public String removeAluno(Long id){
        if(alunoRepository.existsById(id)){
            alunoRepository.deleteById(id);
            return "Aluno removido com sucesso";
        }
        return "Aluno não encontrado";
    }

    public Aluno updateAluno(Long id, Aluno aluno){
        Aluno recuperado = alunoRepository.findById(id).orElse(null);
        if(recuperado != null){
            recuperado.setNome(aluno.getNome());
            recuperado.setIdade(aluno.getIdade());
            recuperado.setEmail(aluno.getEmail());
            recuperado.setCurso(aluno.getCurso());
            return alunoRepository.save(recuperado);
        }
        return null;
    }

}

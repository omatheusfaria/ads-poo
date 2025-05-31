package br.edu.fatecfranca.apirestfulbdexe.service;

import br.edu.fatecfranca.apirestfulbdexe.model.Aluno;
import br.edu.fatecfranca.apirestfulbdexe.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    AlunoRepository alunoRepository;
    public AlunoService(AlunoRepository AlunoRepository) {
        this.alunoRepository = AlunoRepository;
    }

    public List<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno addAluno(Aluno Aluno) {
        return alunoRepository.save(Aluno);
    }

    public String removeAluno(Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return "Aluno removido com sucesso";
        }
        return "Aluno não encontrado";
    }

    public Aluno updateAluno(Long id, Aluno aluno) {
        Aluno recuperado = alunoRepository.findById(id).orElse(null);
        if (recuperado != null) {
            recuperado.setNome(aluno.getNome());
            recuperado.setCurso(aluno.getCurso());
            recuperado.setIdade(aluno.getIdade());
            alunoRepository.save(recuperado);
            return recuperado;
        }
        return null;
    }
}

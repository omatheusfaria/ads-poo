package br.edu.fatecfranca.apirestfulbdexe.repository;


import br.edu.fatecfranca.apirestfulbdexe.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
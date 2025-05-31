package br.edu.fatecfranca.apirestfulbdexe2.repository;

import br.edu.fatecfranca.apirestfulbdexe2.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
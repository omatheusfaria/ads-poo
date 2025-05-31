package br.edu.fatecfranca.apirestfulbdexe2.repository;

import br.edu.fatecfranca.apirestfulbdexe2.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

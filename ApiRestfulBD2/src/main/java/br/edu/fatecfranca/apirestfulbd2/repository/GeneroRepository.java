package br.edu.fatecfranca.apirestfulbd2.repository;

import br.edu.fatecfranca.apirestfulbd2.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends
        JpaRepository<Genero, Long> {
}

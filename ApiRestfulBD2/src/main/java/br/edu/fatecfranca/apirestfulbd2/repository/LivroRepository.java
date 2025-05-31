package br.edu.fatecfranca.apirestfulbd2.repository;
import br.edu.fatecfranca.apirestfulbd2.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LivroRepository extends JpaRepository<Livro, Long> {
    //A interface LivroRepository vai conter os métodos de CRUD vinculados ao Livro, exemplo: findAll, save, findById, etc.

}

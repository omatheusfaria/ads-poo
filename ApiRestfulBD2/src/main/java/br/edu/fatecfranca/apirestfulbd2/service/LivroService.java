package br.edu.fatecfranca.apirestfulbd2.service;
import br.edu.fatecfranca.apirestfulbd2.model.Livro;
import org.springframework.stereotype.Service;
import br.edu.fatecfranca.apirestfulbd2.repository.LivroRepository;

import java.util.List;

@Service
public class LivroService {
    //Injeção de dependência -> serve para se utilizar um objeto sem precisar instancia-lo
    LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    public List<Livro> getLivros(){
        return livroRepository.findAll();
    }

    public Livro addLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public String removeLivro(Long id){
        if (livroRepository.existsById(id)){
            livroRepository.deleteById(id);
            return "Livro removido com sucesso";
        }
        return "Livro não encontrado";
    }

    public Livro updateLivro(Long id, Livro novo){
        Livro recuperado = livroRepository.findById(id).orElse(null);
        if (recuperado != null){
            recuperado.setTitulo(novo.getTitulo());
            recuperado.setAutor(novo.getAutor());
            recuperado.setEditora(novo.getEditora());
            livroRepository.save(recuperado);
            return recuperado;
        }
        return null;
    }
}

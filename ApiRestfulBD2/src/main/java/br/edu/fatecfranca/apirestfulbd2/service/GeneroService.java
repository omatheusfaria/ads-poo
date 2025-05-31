package br.edu.fatecfranca.apirestfulbd2.service;

import br.edu.fatecfranca.apirestfulbd2.model.Genero;
import br.edu.fatecfranca.apirestfulbd2.repository.GeneroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    GeneroRepository generoRepository;
    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }
    public List<Genero> getGeneros(){
        return generoRepository.findAll();
    }
    public Genero addGenero(Genero genero){
        return generoRepository.save(genero);
    }
}

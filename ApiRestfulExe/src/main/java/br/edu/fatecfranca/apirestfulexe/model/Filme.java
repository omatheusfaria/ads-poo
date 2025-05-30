package br.edu.fatecfranca.apirestfulexe.model;

public class Filme {
    private Long id;
    private String titulo, diretor;
    private int ano;
    private float nota;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAno() {
        return ano;
    }

    public float getNota() {
        return nota;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNota(float nota) {
        if (nota >= 0  && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Valor inválido");
        }
    }
}

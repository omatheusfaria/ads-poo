package Exe01;

import javax.swing.*;

public class Aluno {

    //Variaveis primitivas
    public int numeroAluno, idade;
    public float p1, p2;
    public String nome;

    //Métodos construtores
    public Aluno(){
        this.nome = "Nome não definido";
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    //Métodos
    public float notaFinal(){
        return  (this.p1 + this.p2) / 2;
    }

    public void dadosAluno(){
        System.out.println("Dados do aluno: " + "\nNúmero Aluno: " + this.numeroAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nSituacao: " + this.passou());
    }

    public String passou(){
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }
}

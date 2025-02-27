package Exercicios.Q1;

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
    public void notaFinal(){
        JOptionPane.showMessageDialog(null, "Média final = " + (this.p1 + this.p2) / 2);
    }

    public void dadosAluno(){
        JOptionPane.showMessageDialog(null, "Dados do aluno: " + "\nNúmero Aluno: " + this.numeroAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade);
    }
}

package Exercicios.Q1;

import javax.swing.*;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        aluno1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno: "));
        aluno1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        aluno1.p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1: "));
        aluno1.p2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2: "));

        aluno1.dadosAluno();
        aluno1.notaFinal();
    }
}

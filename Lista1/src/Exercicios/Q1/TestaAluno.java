import Exe01.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Matheus";
        aluno1.numeroAluno = 1;
        aluno1.idade = 20;
        aluno1.p1 = 10;
        aluno1.p2 = 10;

        aluno1.dadosAluno();

        Aluno aluno2 = new Aluno(2, "Kaike", 20, 4, 6);

        aluno2.dadosAluno();
    }
}

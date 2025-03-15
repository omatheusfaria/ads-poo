import exe2.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.setNumAluno(123456);
        obj1.setNome("Alice");
        obj1.setIdade(18);
        obj1.setP1(6.5f);
        obj1.setP2(9);
        System.out.println("Nota final: " + obj1.notaFinal());

        Aluno obj2 = new Aluno(654321, "Matheus", 42, 7.5f, 9.5f);
        System.out.println("Nota final: " + obj2.notaFinal());
        System.out.println(obj2.dadosAluno());
    }
}

package exe2;

public class Aluno {
    private int numAluno, idade;
    private String nome;
    private float p1, p2;

    //Construtores


    public Aluno() {
        this.nome = "Sem nome";
    }

    public Aluno(int numAluno, String nome, int idade, float p1, float p2) {
        this.setNumAluno(numAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    //Setters
    public void setNumAluno(int numAluno){
        String aux = String.valueOf(numAluno);
        if (aux.length() == 6){
            this.numAluno = numAluno;
        }
        else System.out.println("Problema no tamanho");
    }

    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Nome invalido");
    }

    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else System.out.println("Idade invalida");
    }

    public void setP1(float p1){
        if (p1 >= 0){
            this.p1 = p1;
        }
        else System.out.println("P1 invalido");
    }

    public void setP2(float p2){
        if (p2 >= 0){
            this.p2 = p2;
        }
        else System.out.println("P2 invalido");
    }

    //Getters
    public String getNome() {
        return this.nome;
    }

    public int getNumAluno() {
        return this.numAluno;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }

    //Métodos
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    public String dadosAluno() {
        return  "numAluno: " + this.numAluno +
                "\n Nome: " + this.nome +
                "\n Idade: " + this.idade +
                "\n p1: " + this.p1 +
                "\n p2: " + this.p2 + "/n";
    }
}
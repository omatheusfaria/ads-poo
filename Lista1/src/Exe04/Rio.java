package Exe04;

public class Rio {
    //Variaveis
    public String nome;
    public float nivel;
    public boolean poluido;

    //Métodos contrutores
    public Rio(){
        this.nome = "Nome não definido";
    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    //Métodos
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if(this.nivel >= x){
            this.nivel -= x;
        }
        else{
            System.out.println("Nivel não pode ser negativo");
        }
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public void mostrar(){
        System.out.println("Nome do Rio: "+this.nome
        +"\nNivel do Rio: "+this.nivel
        +"\nPoluido do Rio: "+ (this.poluido ? "Sim" : "Não")
        +"\n=========================");
    }
}

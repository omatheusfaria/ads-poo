package Exe03;

public class Produto {
    //Variaveis
    public int id, qtde;
    public String descricao;
    public float preco;

    //Métodos Contrutores
    public Produto() {
        this.descricao = "Nenhuma descricao definida";
    }

    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    //Métodos
    public void comprar(int x){
        this.qtde += x;
    }

    public void vender(int x){
        if(this.qtde >= x){
            this.qtde -= x;
        }
        else{
            System.out.println("Estoque insuficiente");
        }
    }

    public void subir(float x){
        this.preco += x;
    }

    public void descer(float x){
        if(this.preco >= x){
            this.preco -= x;
        }
        else{
            System.out.println("Preco nao pode ser menor que 0");
        }
    }

    public void mostrar(){
        System.out.println(
                "ID do produto: " + this.id
            + "\nQuantidade: " + this.qtde
            + "\nDescricao: " + this.descricao
            + "\nPreco: " + this.preco
            + "\n==========================\n"
        );
    }
}

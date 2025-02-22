import javax.swing.*;

public class Carro {
    //Variáveis primitivas
    public int ano;
    public float velocidade;
    //Variáveis classes
    public String marca, modelo;
    //Método Construtor
    public Carro(){
        this.marca = "Marca não definida";
        this.modelo = "Modelo não definido";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    //Métodos
    public void exibirDetalhes(){
        JOptionPane.showMessageDialog(null,
                "\nMarca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Ano: " + this.ano +
                "\n Velocidade: " + this.velocidade
        );
    }

    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    public void frear(float x){
        if(this.velocidade >= x){
            this.velocidade -= x;
        }
        else{
            JOptionPane.showMessageDialog(null, "Velocidade não pode ser negativa");
        }
    }
}
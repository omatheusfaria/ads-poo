package Exe02;

public class Cliente {
    //Variaveis Primitivas
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    //Método construtor

    public Cliente(){
        this.nome = "Nome não definido";
    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    //Métodos
    public void realizarDeposito(float deposito) {
        this.saldo += deposito;
    }

    public void realizarSaque(float saque) {
        if (this.saldo >= saque) {
            this.saldo -= saque;
        }
        else  {
            System.out.println("Saldo insuficiente");
        }
    }

    public void dadosConta(){
        System.out.println("Dados de conta:" + "\nNumero Conta: " + this.numeroConta + "\nNome do Cliente: " + this.nome + "\nSaldo: " + this.saldo);
    }
}

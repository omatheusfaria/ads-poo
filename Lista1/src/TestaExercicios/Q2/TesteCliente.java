package TestaExercicios.Q2;

import Exe02.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Joao";
        cliente1.saldo = 500;
        cliente1.numeroConta = 1;
        cliente1.numeroAgencia = 100;

        cliente1.realizarDeposito(500);
        cliente1.dadosConta();
        cliente1.realizarSaque(800);
        cliente1.dadosConta();

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Maria";
        cliente2.saldo = 4000;
        cliente2.numeroConta = 2;
        cliente2.numeroAgencia = 100;

        cliente2.realizarDeposito(1000);
        cliente2.dadosConta();
        cliente2.realizarSaque(6000);
        cliente2.dadosConta();
    }
}

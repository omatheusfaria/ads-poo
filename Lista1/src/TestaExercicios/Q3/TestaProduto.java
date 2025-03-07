package TestaExercicios.Q3;

import Exe03.Produto;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.id = 1;
        produto1.qtde = 5;
        produto1.descricao = "Teclado";
        produto1.preco = 150;
        produto1.mostrar();
        produto1.comprar(15);
        produto1.descer(50);
        produto1.mostrar();
        produto1.vender(12);
        produto1.subir(75);
        produto1.mostrar();

        Produto produto2 = new Produto(2, 10, "Mouse", 50);
        produto2.mostrar();
        produto2.vender(10);
        produto2.subir(25);
        produto2.mostrar();
        produto2.comprar(25);
        produto2.descer(30);
        produto2.mostrar();

    }
}

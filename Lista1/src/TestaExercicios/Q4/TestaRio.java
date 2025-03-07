package TestaExercicios.Q4;

import Exe04.Rio;

public class TestaRio {
    public static void main(String[] args) {
        Rio r1 = new Rio("Guadalupe", 10, true);
        r1.mostrar();
        r1.chover(6);
        r1.limpar();
        r1.mostrar();
        r1.ensolarar(4);
        r1.sujar();
        r1.mostrar();

        Rio r2 = new Rio();
        r2.nome = "Root";
        r2.nivel = 9;
        r2.poluido = false;
        r2.mostrar();
        r2.sujar();
        r2.chover(6.5f);
        r2.mostrar();
        r2.limpar();
        r2.ensolarar(6);
        r2.mostrar();
    }
}

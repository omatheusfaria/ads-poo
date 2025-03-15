import exe1.Cliente;

public class MainCliente {
    public static void main(String[] args){
        Cliente obj1 = new Cliente();
        obj1.setNumConta("123456-7");
        obj1.setNumAgencia("1234-5");
        obj1.setNome("Matheus");
        obj1.setSaldo(0);
        System.out.println(obj1.exibeDetalhes());
        obj1.depositar(95.8f);
        System.out.println(obj1.exibeDetalhes());
        obj1.sacar(48.4f);
        System.out.println(obj1.exibeDetalhes());
        Cliente obj2 = new Cliente("Miguel", "123-4", "12-3", -90);
        System.out.println(obj2.exibeDetalhes());

    }
}

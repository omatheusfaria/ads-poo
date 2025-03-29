import exe0.*;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.setId(1);
        prod1.setDescription("Raquete");
        prod1.setPrice(300);

        Product prod2 = new Product(2, "Bolinha", 10);

        //System.out.println(car1.exibeCarItem());
        //System.out.println(car2.exibeCarItem());

        ShoppingCart sc1 = new ShoppingCart(111, "Franca");
        sc1.addCarItem(11, 5, prod1);
        sc1.addCarItem(12, 10, prod2);

        System.out.println(sc1.toString());
    }
}
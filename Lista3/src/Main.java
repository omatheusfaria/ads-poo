import exe0.*;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.setId(1);
        prod1.setDescription("Raquete");
        prod1.setPrice(300);

        Product prod2 = new Product(2, "Bolinha", 10);

        CarItem car1 = new CarItem();
        car1.setId(11);
        car1.setQuantity(5);
        car1.setProduct(prod1);

        CarItem car2 = new CarItem(12, 10, prod2);

        //System.out.println(car1.exibeCarItem());
        //System.out.println(car2.exibeCarItem());

        ShoppingCart sc1 = new ShoppingCart(111, "Franca");
        sc1.addCarItem(11, 5, prod1);
        sc1.addCarItem(12, 10, prod2);

        System.out.println(sc1.toString());
    }
}
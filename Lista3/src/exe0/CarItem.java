package exe0;

public class CarItem {
    private int id;
    private float quantity;
    //associoação todo-parte
    private Product product;

    //Product já estava criado, associação fraca
    //agregação
    public CarItem(int id, float quantity, Product product) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString() {
        return "\nCarItem{" +
                "id=" + this.id +
                "quantity=" + this.quantity +
                "product=" + product +
                '}';
    }
}

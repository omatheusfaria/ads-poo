package exe0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date date;
    private float finalPrice;
    private String adress;
    private List<CarItem> carItens;

    public ShoppingCart(){
        this.date = new Date();
        this.adress = "No adress";
        //Alocar espaço na memória para o vetor
        this.carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, String adress) {
        this.setId(id);
        this.date = new Date();
        this.setAdress(adress);
        this.carItens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List getCarItens() {
        return carItens;
    }

    //Não pode ser implementado pois estamos em uma composição
    //public void setCarItens(List carItens) {
    //    this.carItens = carItens;
    //}

    public void addCarItem(int id, float quantity, Product product){
        this.carItens.add(new CarItem(id, quantity, product));
        calculateFinalPrice();
    }
    public void calculateFinalPrice(){
        double soma = 0;
        for(CarItem obj: this.carItens){
            soma += obj.getProduct().getPrice() * obj.getQuantity();
        }
        this.finalPrice = (float) soma;
    }

    public String toString() {
        return "ShoppingCart{" +
                "finalPrice=" + finalPrice +
                ", id=" + id +
                ", date=" + date +
                ", adress='" + adress + '\'' +
                ", carItens=\n" + carItens +
                '}';
    }
}

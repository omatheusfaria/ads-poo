package exe2;

import java.util.Date;

public class Reserva {
    private int id, validade;
    private Date date;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(){
        this.passageiro = new Passageiro();
        this.voo = new Voo();
    }

    public Reserva(int id, int validade, Passageiro passageiro, Voo voo) {
        this.id = id;
        this.validade = validade;
        this.date = new Date();
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getId() {
        return id;
    }

    public int getValidade() {
        return validade;
    }

    public Date getDate() {
        return date;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", validade=" + validade +
                ", date=" + date +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }
}

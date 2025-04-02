package exe2;

import java.time.LocalDate;

public class Voo {
    private int id;
    private LocalDate date;
    private String origem, destino;

    public Voo(){
        this.origem = "Origem não definida";
        this.destino = "Destino não definido";
    }

    public Voo(int id, String origem, String destino){
        this.setId(id);
        this.setOrigem(origem);
        this.setDestino(destino);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate data) {
        this.date = data;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String toString() {
        return "\nVoo{" +
                "id=" + id +
                ", date=" + date +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}

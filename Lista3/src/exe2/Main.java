package exe2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args){


        Passageiro p1 = new Passageiro(1, "111", "Matheus");

        Voo v1 = new Voo(11, "Franca", "São Paulo");

        Reserva r1 = new Reserva(112, 15, p1, v1);
        
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate objData = LocalDate.parse("28/03/2025", formatter);

        v1.setDate(objData);

        System.out.println(r1);
    }
}

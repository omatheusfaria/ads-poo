package exe1;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student(1, "Matheus");

        Book b1 = new Book(11, "Feynman", "Física");
        Book b2 = new Book(12, "Paul Erdos", "Matematica");

        Loan lo1 = new Loan(100, new Date(), s1);

        lo1.addLoanItens(1001, 15, b1);
        lo1.addLoanItens(1002, 15, b2);

        System.out.println(lo1);
    }
}

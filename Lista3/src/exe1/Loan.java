package exe1;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Loan {
    private int id;
    private Date date;
    private Student student;
    private List<LoanItem> loanItens;
    
    public Loan(){
        this.loanItens = new ArrayList<LoanItem>();
        this.student = new Student();
        this.date = new Date();
    }
    
    public Loan(int id, Date date, Student student) {
        this.setId(id);
        this.setStudent(student);
        this.loanItens = new ArrayList<LoanItem>();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Student getStudent() {
        return student;
    }

    public List<LoanItem> getloanItens() {
        return loanItens;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addLoanItens(int id, int daysLoaned, Book book){
        this.loanItens.add(new LoanItem(id, daysLoaned, book));
    }
    
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", date=" + date +
                ", loanItens=\n" + loanItens +
                '}';
    }
}

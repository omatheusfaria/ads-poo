package exe1;

public class LoanItem {
    private int id, daysLoaned;
    private Book book;

    public LoanItem(int id, int daysLoaned, Book book) {
        this.setId(id);
        this.setDaysLoaned(daysLoaned);
        this.setBook(book);
    }

    public int getId() {
        return id;
    }

    public int getDaysLoaned() {
        return daysLoaned;
    }

    public Book getBook() {
        return book;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDaysLoaned(int daysLoaned) {
        this.daysLoaned = daysLoaned;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String toString() {
        return "\nLoanItem{" +
                "id=" + id +
                ", daysLoaned=" + daysLoaned +
                ", book=" + book +
                '}';
    }
}

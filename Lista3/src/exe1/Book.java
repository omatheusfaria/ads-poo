package exe1;
public class Book {
    private int id;
    private String author, title;

    public Book (){
        this.author = "Autor não definido!";
        this.title = "Titulo não definido!";
    }

    public Book (int id, String author, String title){
        setId(id);
        setAuthor(author);
        setTitle(title);
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

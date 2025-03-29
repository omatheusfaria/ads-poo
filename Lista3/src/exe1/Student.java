package exe1;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;

    public Student (){
        this.name = "Nome não definido!";
    }

    public Student(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

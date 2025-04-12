package musica;
import java.util.ArrayList;
import java.util.List;
public class Recital {
    private String tema;
    private List<Musico> musicos;

    public Recital(){
        this.tema = "Sem tema";
        this.musicos = new ArrayList<Musico>();
    }

    public Recital(String rema){
        this.tema = tema;
        this.musicos = new ArrayList<Musico>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    //Adicionar musico no recital
    public void addMusico(Musico musico){
        // musico pode se comportar como baterista, guitarrista ou pianista.
        this.musicos.add(musico);
    }

    //Apresentar todos
    public void apresentarTodos(){
        for (Musico obj : this.musicos){
            //Polimorfismo -> obj vai executar toString de classes diferentes
            System.out.println(obj.tocar());
        }
    }

    public String resumeRecital(){
        this.apresentarTodos();
        return "Qtde músicos " + this.musicos.size() +
                " Tema: " + this.tema;
    }
}

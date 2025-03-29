package exe2;

public class Passageiro {
    private int id;
    private String cpf, nome;

    public Passageiro(){
        this.cpf = "CPF não definido";
        this.nome = "Nome não definido";
    }

    public Passageiro(int id, String cpf, String nome){
        this.setId(id);
        this.setCpf(cpf);
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "\nPassageiro{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

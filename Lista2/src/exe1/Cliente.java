package exe1;

public class Cliente {
    private String nome, numConta, numAgencia;
    private float saldo;

    //Contrutores
    public Cliente(){
        this.numConta = "111111-1";
        this.numAgencia = "1111-1";
        this.nome = "Sem nome";
    }

    public Cliente(String nome, String numConta, String numAgencia, float saldo){
        this.setNome(nome);
        this.setNumConta(numConta);
        this.setNumAgencia(numAgencia);
        this.setSaldo(saldo);
    }

    //Setters
    public void setNumConta(String numConta){
        if(numConta.length() == 8){
            if (numConta.charAt(6) == '-'){
                this.numConta = numConta;
            }
            else System.out.println("Problema no DV");
        }
        else System.out.println("Problema no tamanho");
    }

    public void setNumAgencia(String numAgencia){
        if (numAgencia.length() == 6){
            if (numAgencia.charAt(4) == '-'){
                this.numAgencia = numAgencia;
            }
            else System.out.println("Problema no DV");
        }
        else System.out.println("Problema no tamanho");
    }

    public void setNome (String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Nome invalido");
    }

    public void setSaldo(float saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo negativo");
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public String getNumConta(){
        return this.numConta;
    }

    public String getNumAgencia(){
        return this.numAgencia;
    }

    public float getSaldo() {
        return this.saldo;
    }

    //Métodos
    public void depositar(float x){
        this.setSaldo(this.getSaldo() + x);
    }

    public void sacar(float x){
        this.setSaldo(this.getSaldo() - x);
    }

    public String exibeDetalhes() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", numConta='" + this.numConta + '\'' +
                ", numAgencia='" + this.numAgencia + '\'' +
                ", saldo=" + this.saldo +
                '}';
    }
}

package exe1;

public class Cliente {
    private String nome, numConta, numAgencia;
    private float saldo;

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
}

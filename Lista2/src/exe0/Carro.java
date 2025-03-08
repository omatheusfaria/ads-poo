package exe0;

public class Carro {
    //modificador de acesso private - variáveis são encapsuladas
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro(){
        this.marca = "Sem marca";
        this.modelo = "Sem modelo";
    }
    public Carro(String marca, String modelo, int ano, float velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }
    // getters
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAno() {
        return this.ano;
    }
    public float getVelocidade() {
        return this.velocidade;
    }

    // setters
    public void setVelocidade(float velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        }
        else{
            System.out.println("Velocidade não pode ficar negativo");
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
        else{
            System.out.println("Ano não pode ficar negativo");
        }
    }

    //Acelerar
    public void acelerar(float x){
        this.setVelocidade(this.velocidade + x);
        this.verificarLimiteVelocidade();
    }

    //Freiar
    public void frear(float x){
        this.setVelocidade(this.velocidade - x);
    }
    public String exibeDados(){
        return "Marca: " + this.marca +
                "Modelo: " + this.modelo +
                "Ano: " + this.ano +
                "Velocidade " + this.velocidade;
    }

    // verificar se o carro ultrapassou 200
    // método só pode ser utilizado na própria classe

    private void verificarLimiteVelocidade(){
        if (this.velocidade > 200){
            this.velocidade = 200;
            System.out.println("Velocidade não pode ultrapassar 200");
        }
    }
}

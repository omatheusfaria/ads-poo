public class Sono {
    public float horasDormidas;
    public int sonoInterrompido;
    public int intersidadeSono;
    public String nome;

    public Sono(){
        this.nome = "Nome não definido!";
    }

    public Sono(String nome, float horasDormidas, int intersidadeSono, int sonoInterrompido){
        this.nome = nome;
        this.horasDormidas = horasDormidas;
        this.intersidadeSono = intersidadeSono;
        this.sonoInterrompido = sonoInterrompido;
    }
    public void exibirResposta(){
        System.out.println(
                "Nome: " + this.nome +
                "\n Horas Dormidas: " + this.horasDormidas +
                "\n Intensidade do Sono: " + this.intersidadeSono +
                "\n Interrupções do Sono: " + this.sonoInterrompido
        );
    }
}

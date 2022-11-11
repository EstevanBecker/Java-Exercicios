package Programador;

public class Programador  extends Funcionario {


    private String linguagem;

    public Programador(String nome, int idade, String linguagem) {
        super(nome, idade);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}

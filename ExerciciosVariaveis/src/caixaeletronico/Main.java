package br.com.jeanalves;
import br.com.jeanalves.caixaeletronico.CaixaEletronico;
public class Main {
    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        caixa.iniciar();
        /*caixa.imprimirEstadoAtual();
        caixa.sacar(610);
        caixa.sacar(300);
        caixa.adicionarCedulas(15, 50);
        caixa.adicionarCedulas(5, 10);
        caixa.imprimirEstadoAtual();*/
    }
}
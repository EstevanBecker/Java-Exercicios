package br.com.jeanalves.caixaeletronico;

public class SimulacaoSaqueCedula {
    public TipoCedula tipoCedula;
    public int resto;
    public int quantidadeUtilizada;

    public SimulacaoSaqueCedula(TipoCedula tipoCedula, int resto, int quantidadeUtilizada) {
        this.tipoCedula = tipoCedula;
        this.resto = resto;
        this.quantidadeUtilizada = quantidadeUtilizada;
    }

}

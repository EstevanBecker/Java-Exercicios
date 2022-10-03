package Objetos;

public class ListagemDeCarros {
    String marca;
    String tipoCombustivel;
    double kmPorLitro;
    double quantidadeCombustivel;
    double capacidadeCombustivel;

    public ListagemDeCarros (String marca, String tipoCombustivel, double kmPorLitro, double quantidadeCombustivel, double capacidadeCombustivel) {
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
        this.kmPorLitro = kmPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.capacidadeCombustivel = capacidadeCombustivel;
    }
}

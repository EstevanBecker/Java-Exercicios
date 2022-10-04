package Objetos;
import java.util.Scanner;

public class Carro {
    String marca;
    String tipoCombustivel;
    double kmPorLitro;
    double quantidadeCombustivel;
    double capacidadeCombustivel;
    Scanner meuScanner = new Scanner(System.in);

    public Carro(String marca, String tipoCombustivel, double kmPorLitro, double quantidadeCombustivel, double capacidadeCombustivel) {
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
        this.kmPorLitro = kmPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.capacidadeCombustivel = capacidadeCombustivel;
    }
}

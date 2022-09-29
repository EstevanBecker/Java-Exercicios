package ExerciciosLista1;
import java.util.Scanner;
public class Loja {
    public void CalcularPrestacao {
        Scanner meuScanner - new Scanner(System.in);
        System.out.println("Insira o valor total da compra");
        double valorTotal = meuScanner.nextDouble();

        double valorParcelado = valorTotal / 5;

        System.out.println ("O Valor de cada parcela será de " + valorParcelado);
    }
}

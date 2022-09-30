package ExerciciosLista1;
import java.util.Scanner;
import java.lang.Math;
public class areaPi {
    double valorPi = 3.14;
    public void calcularAreaPi () {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println ("Escreva o raio do circulo");
        double raioCirculo = meuScanner.nextDouble();

        double calculoPi = valorPi * (raioCirculo * raioCirculo);

        System.out.println ("A Area desse circulo é de: " +calculoPi);
    }
}

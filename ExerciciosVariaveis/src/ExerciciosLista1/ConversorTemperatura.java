//1.Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e exiba os resultados
package ExerciciosLista1;
import java.util.Scanner;

public class ConversorTemperatura {

    public void ConverterTemperatura()

    {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Escreva quantos Graus Celsius está no momento: ");
        double Celsius = meuScanner.nextDouble();

        double Kelvin = Celsius + 273.15;
        double Fahrenheit = Celsius * 1.8 + 32;
        double Rankine = Celsius * 1.8 + 32 + 459.67;
        double Reamur = Celsius * 0.8;

        System.out.println("A conversão de Celsius para Kelvin é: " + Kelvin);
        System.out.println("A conversão de Celsius para Fahrenheit é: " + Fahrenheit);
        System.out.println("A conversão de Celsius para Rankine é: " + Rankine);
        System.out.println("A conversão de Celsius para Reamur é: " + Reamur);
    }

}

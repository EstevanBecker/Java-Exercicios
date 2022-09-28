package ExerciciosLista1;
import java.util.Scanner;

public class ConversorReal {
    double Dolar = 5.33;
    double Euro = 5.19;
    double Libra = 5.80;
    public void ConverterReal (){
        Scanner meuScanner = new Scanner(System.in);

        System.out.println ("Digite a quantidade de real (R$) que você deseja converter");
        double Real = meuScanner.nextDouble();

        double converterDolar = Real / Dolar;
        double converterEuro = Real / Euro;
        double converterLibra = Real / Libra;

        System.out.println ("O Valor em dolar sera de $" +converterDolar);
        System.out.println ("O Valor em Euro será de (EUR)" +converterEuro);
        System.out.println ("O Valor em Libra será de £" +converterLibra);
    }
}

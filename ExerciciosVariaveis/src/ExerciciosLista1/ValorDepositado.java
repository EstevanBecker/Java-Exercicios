//Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês.
package ExerciciosLista1;
import java.util.Scanner;

public class ValorDepositado {
    double rendimento = 0.07;
    public void DepositarValor () {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println ("Digite o valor depositado");
        double valorDepositado = meuScanner.nextDouble();

        double valorRendimento = valorDepositado * rendimento;
        double valorAplicado = valorRendimento + valorDepositado;

        System.out.println ("Após 1 mês o rendimento será de " + valorRendimento);

        System.out.println ("Sendo assim o o senhor terá R$" + valorAplicado);

    }
}

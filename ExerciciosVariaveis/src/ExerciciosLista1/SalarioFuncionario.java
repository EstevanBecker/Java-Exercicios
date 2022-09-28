//5.Crie um programa que com base em um salário de um funcionário, reajusta o salário em 7% e mostra o valor antes do reajuste e após.
package ExerciciosLista1;
import java.util.Scanner;
public class SalarioFuncionario {
    double reajuste = 0.07;
    public void CalcularSalario () {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println ("Qual o valor do seu salário atual?");
        float salarioAtual = meuScanner.nextFloat();

        double SalarioReajuste = salarioAtual * reajuste;
        double SalarioReajustado = salarioAtual + SalarioReajuste;

        System.out.println ("Seu salário anterior era de R$" +salarioAtual+ " Com o reajuste ele passa a ser de R$" +SalarioReajustado);
    }
}

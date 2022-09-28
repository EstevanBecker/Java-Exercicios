//3.Escreva um programa que realize o cálculo do empréstimo a juros compostos
package ExerciciosLista1;
import java.util.Scanner;
import java.lang.Math;
public class EmprestimoComposto {
    double Juros_Mes = 0.02;
    public void Emprestimo() {

        Scanner meuScanner = new Scanner(System.in);

        System.out.println ("Qual a quantia deseja para o Emprestimo?");
        float valorEmprestimo = meuScanner.nextFloat();

        System.out.println ("Em quantos meses o senhor deseja pagar?");
        int meses = meuScanner.nextInt();

        double ValorFinal = valorEmprestimo * Math.pow((1+Juros_Mes), meses);

        System.out.println ("O Valor que você deverá pagar ao final é R$" + ValorFinal);
    }
}

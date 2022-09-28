package ExerciciosLista1;
import java.util.Scanner;
import java.lang.Math;

public class CalculadoraBasica {
    public void CalcularNumeros() {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Escreva dois numeros");
        int num1 = meuScanner.nextInt();
        int num2 = meuScanner.nextInt();

        System.out.println("Escolha uma operação entre: +, -, *, /");
        char operacao = meuScanner.next().charAt(0);

        int calculo = 0;
        switch (operacao) {
            case '+':
                calculo = num1 + num2;
                break;

            case '-':
                calculo = num1 - num2;
                break;

            case '/':
                calculo = num1 / num2;
                break;
            case '*':
                calculo = num1 * num2;
                break;

            default:
                System.out.println("Operação inválida");
        }
        System.out.println("O Resultado é " + calculo);
    }
}

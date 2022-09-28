//4.Crie um programa que você atribua um valor da idade de uma pessoa e calcule quantos dias aquela pessoa já viveu
package ExerciciosLista1;
import java.util.Scanner;
public class PessoaIdade {
    public void atribuirIdade () {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println ("Escreva sua idade");
        int idade = meuScanner.nextInt();

        int idade_Em_Dias= idade * 365;
        int idade_Em_Semanas= idade * 48;

        System.out.println ("Sua idade em Dias é: " + idade_Em_Dias + " Dias");
        System.out.println ("Sua idade em Semanas é: " + idade_Em_Semanas + " Semanas");

    }
}

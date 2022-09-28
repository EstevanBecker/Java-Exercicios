//9.Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre. No final deverá informar a média do aluno.
package ExerciciosLista1;
import java.util.Scanner;
public class NotasAlunos {
    public void calcularNotas () {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println ("Informe seu nome");
        String Nome = meuScanner.next();

        System.out.println ("Olá " + Nome + " Insira suas 1º notas do semestre");
        int nota1  = meuScanner.nextInt();
        System.out.println ("Olá " + Nome + " Insira suas 2º notas do semestre");
        int nota2  = meuScanner.nextInt();
        System.out.println ("Olá " + Nome + " Insira suas 3º notas do semestre");
        int nota3 = meuScanner.nextInt();

       int media = (nota1 + nota2 + nota3) / 3;

       System.out.println ("Sua média é " + media);

       if (media > 7) {
           System.out.println ("Aluno aprovado");
       }
       else {
           System.out.println ("Aluno reprovado");
       }
    }
}

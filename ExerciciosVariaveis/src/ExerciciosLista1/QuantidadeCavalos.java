//2.Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas a uma altura de “h” em “t” segundos.
package ExerciciosLista1;
import java.util.Scanner;
public class QuantidadeCavalos {
    public void LevantarMassa(){
        Scanner meuScanner = new Scanner(System.in);

            System.out.println ("Quantos quilogramas possui esse item?");
            int m = meuScanner.nextInt();

            System.out.println ("Qual é a altura em que isso será levantado?");
            int h = meuScanner.nextInt();

            System.out.println ("Em quantos segundos?");
            int t = meuScanner.nextInt();

            double cavalos = (m * h / t) / 745.6999;

            System.out.println ("Serão necessários " + cavalos + " Cavalos para levantar isso em determinado tempo");
    }
}

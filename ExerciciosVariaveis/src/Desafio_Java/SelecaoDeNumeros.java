package Desafio_Java;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SelecaoDeNumeros {
    List <Integer> entradaNumeros = new ArrayList();

    public void selecionarNumeros() {
        int numeroRecebido;
        Scanner meuScanner = new Scanner(System.in);

        do {
            System.out.println ("Escreva um numero positivo maior que 0. Ou -1 para encerrar o programa");
            numeroRecebido = meuScanner.nextInt();

            if (numeroRecebido > 0) {
                guardarNumeros(numeroRecebido);
            }
        } while (numeroRecebido !=-1);

        if (numeroRecebido == -1) {
            MostrarNumeros();
        }
    }
    public void guardarNumeros(int numeroRecebido) {
        entradaNumeros.add(numeroRecebido);
        Collections.sort(entradaNumeros);
    }

    public void MostrarNumeros() {
        int menorNumero = entradaNumeros.get(0);
        System.out.println ("O Menor numero recebido foi " + menorNumero);

        int maiorNumero = entradaNumeros.get(entradaNumeros.size () -1);
        System.out.println ("O Maior numero recebido foi " +maiorNumero);
    }
}

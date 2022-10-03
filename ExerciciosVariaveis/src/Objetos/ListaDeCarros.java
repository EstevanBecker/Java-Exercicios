package Objetos;
import java.util.ArrayList;
import Objetos.ListagemDeCarros;
import java.util.Scanner;

public class ListaDeCarros {
    ListagemDeCarros[] listaDeCarros = {
            new ListagemDeCarros (" Gol ", " Gasolina ", 12, 22, 50),
            new ListagemDeCarros (" Corsa ", " Etanol ", 7, 20, 80),
            new ListagemDeCarros (" Saveiro ", " Gasolina ", 10, 30, 90)};

    public void ListarCarros(){
        int selecaoCarro;
        int i = 1;
        for (ListagemDeCarros listaDeCarro : listaDeCarros) {
            System.out.print(i + ".");
            System.out.println ("Carros:" + listaDeCarro.marca + "Tipo de combustível " + listaDeCarro.tipoCombustivel + "quantidade de Litros por km " + listaDeCarro.kmPorLitro + "quantidade de combustivel no tanque: " + listaDeCarro.quantidadeCombustivel + "Capacidade de combustivel " + listaDeCarro.capacidadeCombustivel);
            i++;
        }
        selecaoCarro = selecionarCarro();
        switch (selecaoCarro) {
            case 1:
                System.out.println ("Voce escolheu o gol");
                break;
            case 2:
                System.out.println ("Voce escolheu o corsa");
                break;
            case 3:
                System.out.println ("Voce escolheu a saveiro");
                break;
        }

    }
    public int selecionarCarro(){
        int selecionar;
        Scanner meuScanner = new Scanner(System.in);
        System.out.println ("Selecione um código");
        selecionar = meuScanner.nextInt();
        return selecionar;
    }

    public int selecionarAndar(){
        int selecionarAndar;
        Scanner meuScanner = new Scanner(System.in);
        System.out.println ("Caso deseje andar digite 1, caso deseje abastecer digite 2, caso deseje encerrar digite 3");
        selecionarAndar = meuScanner.nextInt();
        return selecionarAndar;
    }
}
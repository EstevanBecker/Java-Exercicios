package Objetos;
import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeCarros {
    Carro[] listaDeCarros = {
            new Carro(" Gol ", " Gasolina ", 12, 22, 50),
            new Carro(" Corsa ", " Etanol ", 7, 20, 80),
            new Carro(" Saveiro ", " Gasolina ", 10, 30, 90)};

    Scanner meuScanner = new Scanner(System.in);

    public void ListarCarros(){
        int selecaoCarro;
        int i = 1;
        for (Carro listaDeCarro : listaDeCarros) {
            System.out.print(i + ".");
            System.out.println ("Carros:" + listaDeCarro.marca + "| Tipo de combustível:" + listaDeCarro.tipoCombustivel + "| quantidade de Litros por km:" + listaDeCarro.kmPorLitro + "| quantidade de combustivel no tanque: " + listaDeCarro.quantidadeCombustivel + "| Capacidade de combustivel:" + listaDeCarro.capacidadeCombustivel);
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
        System.out.println ("Selecione um código");
        selecionar = meuScanner.nextInt();
        return selecionar;
    }

    public int selecionarAndar(){
        int selecionarAndar;
        System.out.println ("Caso deseje andar digite 1, caso deseje abastecer digite 2, caso deseje encerrar digite 3");
        selecionarAndar = meuScanner.nextInt();
        return selecionarAndar;
    }
}

package Objetos;
import java.util.Scanner;

public class MenuDeCarros {
    Carro[] listaDeCarros = {
            new Carro(" Gol ", " Gasolina ", 12, 22, 50),
            new Carro(" Corsa ", " Etanol ", 7, 20, 80),
            new Carro(" Saveiro ", " Gasolina ", 12, 40, 90)};

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
                selecionarAndar(selecaoCarro);
                break;
            case 2:
                System.out.println ("Voce escolheu o corsa");
                selecionarAndar(selecaoCarro);
                break;
            case 3:
                System.out.println ("Voce escolheu a saveiro");
                selecionarAndar(selecaoCarro);
                break;
        }

    }
    public int selecionarCarro(){
        int selecionar;
        System.out.println ("Selecione um código");
        selecionar = meuScanner.nextInt();
        return selecionar;
    }

    public double selecionarAndar(int selecaoCarro){
        double qtdLitrosUtilizados= 0.0;
        double selecionarAndar;
        System.out.println ("Caso deseje andar digite 1, caso deseje abastecer digite 2, caso deseje encerrar digite 3");
        selecionarAndar = meuScanner.nextDouble();
        if (selecionarAndar == 1) {
            double kmViagem;
            System.out.println("Selecione quantos Km você deseja andar");
            kmViagem = meuScanner.nextDouble();
            double calcViagem = ((listaDeCarros[selecaoCarro].kmPorLitro/kmViagem));
            System.out.println ("Seu carro ira consumir: " + calcViagem +  " Litros nesta viagem");
            if (calcViagem < listaDeCarros[selecaoCarro].quantidadeCombustivel) {
                qtdLitrosUtilizados = ((listaDeCarros[selecaoCarro].quantidadeCombustivel - calcViagem));
                System.out.println("Você possui" + listaDeCarros[selecaoCarro].quantidadeCombustivel + " Litros, após a viagem terá" + qtdLitrosUtilizados + "Litros");
            }
            else {
                System.out.println ("É Necessário abastecer antes");
            }
        }
        return selecionarAndar;
    }
}

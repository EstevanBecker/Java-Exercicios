package Objetos;
import java.util.Scanner;

public class MenuDeCarros {
    Carro[] listaDeCarros = {
            new Carro(" Gol ", " Gasolina ", 12, 22, 55),
            new Carro(" Corsa ", " Etanol ", 7, 20, 54),
            new Carro(" Saveiro ", " Gasolina ", 12, 10, 53)};

    Posto posto = new Posto(listaDeCarros);

    Scanner meuScanner = new Scanner(System.in);

    public void ListarCarros() {
        //int selecaoCarro;
        int i = 1;
        for (Carro listaDeCarro : listaDeCarros) {
            System.out.print(i++ + ".");
            System.out.println("Carros:" + listaDeCarro.marca + "| Tipo de combustível:" + listaDeCarro.tipoCombustivel + "| quantidade de Litros por km:" + listaDeCarro.kmPorLitro + "| quantidade de combustivel no tanque: " + listaDeCarro.quantidadeCombustivel + "| Capacidade de combustivel:" + listaDeCarro.capacidadeCombustivel);
        }
        int selecaoCarro = selecionarCarro();


    }

    public int selecionarCarro() {
        int selecionar;
        System.out.println("Selecione um código");
        selecionar = meuScanner.nextInt();

        switch (selecionar) {
            case 1:
                System.out.println("Voce escolheu o gol");
                break;
            case 2:
                System.out.println("Voce escolheu o corsa");
                break;
            case 3:
                System.out.println("Voce escolheu a saveiro");
                break;
            default:
                System.out.println("Voce escolheu um valor incorreto, favor tente novamente");
                selecionarCarro();
                break;
        }

        selecionarAndar(selecionar);
        return selecionar;
    }

    public double selecionarAndar(int selecaoCarro) {
        double qtdLitrosUtilizados = 0.0;
        //  double selecionarAndar;

        System.out.println("Caso deseje andar digite 1, caso deseje abastecer digite 2, caso deseje encerrar digite 3");
        double selecionarAndar = meuScanner.nextDouble();

        if (selecionarAndar == 1) {
            // double kmViagem;
            System.out.println("Selecione quantos Km você deseja andar");

            double kmViagem = meuScanner.nextDouble();
            Carro carroEscolhido = listaDeCarros[selecaoCarro - 1];
            double calcViagem = (kmViagem / carroEscolhido.kmPorLitro);

            System.out.println("Seu carro ira consumir: " + calcViagem + " Litros nesta viagem");

            if (calcViagem <= carroEscolhido.quantidadeCombustivel) {
                qtdLitrosUtilizados = (carroEscolhido.quantidadeCombustivel - calcViagem);
                System.out.println("Você possui" + carroEscolhido.quantidadeCombustivel + " Litros, após a viagem terá" + qtdLitrosUtilizados + "Litros");
            } else {
                System.out.println("É Necessário abastecer antes");
                posto.abastecer(selecaoCarro, calcViagem);
            }
        }

        return selecionarAndar;
    }
}
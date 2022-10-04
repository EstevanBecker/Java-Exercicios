package Objetos;
import java.util.Scanner;

public class MenuDeCarros {
    Carro[] listaDeCarros = {
            new Carro(" Gol ", " Gasolina ", 12, 22, 55),
            new Carro(" Corsa ", " Etanol ", 7, 20, 54),
            new Carro(" Saveiro ", " Gasolina ", 12, 10, 53)};

    Scanner meuScanner = new Scanner(System.in);

    public void ListarCarros() {
        int selecaoCarro;
        int i = 1;
        for (Carro listaDeCarro : listaDeCarros) {
            System.out.print(i + ".");
            System.out.println("Carros:" + listaDeCarro.marca + "| Tipo de combustível:" + listaDeCarro.tipoCombustivel + "| quantidade de Litros por km:" + listaDeCarro.kmPorLitro + "| quantidade de combustivel no tanque: " + listaDeCarro.quantidadeCombustivel + "| Capacidade de combustivel:" + listaDeCarro.capacidadeCombustivel);
            i++;
        }
        selecaoCarro = selecionarCarro();
        switch (selecaoCarro) {
            case 1:
                System.out.println("Voce escolheu o gol");
                selecionarAndar(selecaoCarro);
                break;
            case 2:
                System.out.println("Voce escolheu o corsa");
                selecionarAndar(selecaoCarro);
                break;
            case 3:
                System.out.println("Voce escolheu a saveiro");
                selecionarAndar(selecaoCarro);
                break;
        }

    }

    public int selecionarCarro() {
        int selecionar;
        System.out.println("Selecione um código");
        selecionar = meuScanner.nextInt();
        return selecionar;
    }

    public double selecionarAndar(int selecaoCarro) {
        double qtdLitrosUtilizados = 0.0;
        double selecionarAndar;
        System.out.println("Caso deseje andar digite 1, caso deseje abastecer digite 2, caso deseje encerrar digite 3");
        selecionarAndar = meuScanner.nextDouble();
        if (selecionarAndar == 1) {
            double kmViagem;
            System.out.println("Selecione quantos Km você deseja andar");
            kmViagem = meuScanner.nextDouble();
            double calcViagem = ((kmViagem/listaDeCarros[selecaoCarro-1].kmPorLitro));
            System.out.println("Seu carro ira consumir: " + calcViagem + " Litros nesta viagem");
            if (calcViagem < listaDeCarros[selecaoCarro-1].quantidadeCombustivel) {
                qtdLitrosUtilizados = ((listaDeCarros[selecaoCarro-1].quantidadeCombustivel - calcViagem));
                System.out.println("Você possui" + listaDeCarros[selecaoCarro-1].quantidadeCombustivel + " Litros, após a viagem terá" + qtdLitrosUtilizados + "Litros");
            } else {
                System.out.println("É Necessário abastecer antes");
                Abastecer(selecaoCarro, calcViagem);
            }
        }
        return selecionarAndar;
    }

    public double Abastecer(int selecaoCarro, double calcViagem){
        double qtdCombustivelAbastecido = 0.0;
       System.out.println ("O Carro atualmente possui " + listaDeCarros[selecaoCarro-1].quantidadeCombustivel + "Litros, quanto o senhor deseja abastecer?");
       double abastecer = meuScanner.nextDouble();
       double qtdAtualCombustivel= ((abastecer + listaDeCarros[selecaoCarro-1].quantidadeCombustivel));
       qtdCombustivelAbastecido = ((qtdAtualCombustivel + listaDeCarros[selecaoCarro-1].quantidadeCombustivel));
       if (abastecer > listaDeCarros[selecaoCarro-1].capacidadeCombustivel) {
           System.out.println ("O Valor excede a capacidade de litros suportados no carro");
       }
       else if (qtdAtualCombustivel >= calcViagem) {
           System.out.println ("Você abasteceu " + abastecer + "litros, seu carro agora está com " + qtdCombustivelAbastecido + "litros e pode realizar essa viagem");
           calcularGasto(selecaoCarro, abastecer, qtdAtualCombustivel);
       }
       while (qtdCombustivelAbastecido < calcViagem) {
            Abastecer(selecaoCarro, calcViagem);
        }
       return abastecer;
    }


    public void calcularGasto (int selecaoCarro, double abastecer, double qtdAtualCombustivel) {
        double precoGasolina = 5.74;
        double precoEtanol = 3.80;
        if (listaDeCarros[selecaoCarro-1].tipoCombustivel.equals("Gasolina")){
            double calcGastoGasolina = abastecer * precoGasolina;
            System.out.println ("Seu gasto foi de R$" + calcGastoGasolina);
        }
        else {
            double calcGastoEtanol = abastecer*precoEtanol;
            System.out.println ("Seu gasto foi de R$" +calcGastoEtanol);
        }
    }
}

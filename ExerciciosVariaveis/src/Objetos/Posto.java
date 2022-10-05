package Objetos;
import java.util.Scanner;
public class Posto {
    Carro[] listaDeCarros;
    Scanner meuScanner = new Scanner(System.in);
    public Posto(Carro[] listaDeCarros){
        this.listaDeCarros = listaDeCarros;
    }
    public double abastecer(int selecaoCarro, double calcViagem){
        //double qtdCombustivelAbastecido = 0.0;
        Carro carroEscolhido = listaDeCarros[selecaoCarro-1];

        System.out.println ("O Carro atualmente possui " + carroEscolhido.quantidadeCombustivel + " Litros, quanto o senhor deseja abastecer?");

        double abastecer = meuScanner.nextDouble();
        double qtdAtualCombustivel= (abastecer + carroEscolhido.quantidadeCombustivel);
        //qtdCombustivelAbastecido = ((qtdAtualCombustivel + carroEscolhido.quantidadeCombustivel));

        if (qtdAtualCombustivel > carroEscolhido.capacidadeCombustivel) {
            System.out.println ("O Valor excede a capacidade de litros suportados no carro");
            // TODO pedir outro valor
        }
        else if (qtdAtualCombustivel >= calcViagem) {
            System.out.println ("Você abasteceu " + abastecer + "litros, seu carro agora está com " + qtdAtualCombustivel + "litros e pode realizar essa viagem");
            calcularGasto(selecaoCarro, abastecer);
            carroEscolhido.quantidadeCombustivel = qtdAtualCombustivel;
        }

        while (qtdAtualCombustivel < calcViagem) {
            abastecer(selecaoCarro, calcViagem);
        }
        return abastecer;
    }


    public void calcularGasto (int selecaoCarro, double abastecer) {
        double precoGasolina = 5.74;
        double precoEtanol = 3.80;
        Carro carroEscolhido = listaDeCarros[selecaoCarro-1];

        if (carroEscolhido.tipoCombustivel.equals("Gasolina")){
            double calcGastoGasolina = abastecer * precoGasolina;
            System.out.println ("Seu gasto foi de R$" + calcGastoGasolina);
        }
        else {
            double calcGastoEtanol = abastecer*precoEtanol;
            System.out.println ("Seu gasto foi de R$" +calcGastoEtanol);
        }
    }

    public void somenteAbastecer (int selecaoCarro) {
        Carro carroEscolhido = listaDeCarros[selecaoCarro-1];
        System.out.println("Quanto o senhor deseje colocar de combustível?");
        double abastecer = meuScanner.nextDouble();

        double qtdCombustivelAtual = (abastecer + carroEscolhido.quantidadeCombustivel);
        carroEscolhido.quantidadeCombustivel = qtdCombustivelAtual;
        System.out.println("Seu carro está com: " + carroEscolhido.quantidadeCombustivel + " Litros");
        calcularGasto(selecaoCarro, abastecer);
        
    }
}


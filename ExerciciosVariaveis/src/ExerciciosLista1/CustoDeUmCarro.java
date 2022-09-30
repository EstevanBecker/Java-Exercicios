package ExerciciosLista1;
import java.util.Scanner;
public class CustoDeUmCarro {
    double porcentagemDistribuidor = 0.28;
    double impostos = 0.45;
    public void calcularCusto {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println ("informe o custo do carro: ");
        double custoCarro = meuScanner.nextDouble();

        double custoCarroDistribuidor = custoCarro * porcentagemDistribuidor;
        double custoCarroImpostos = custoCarro * impostos;

        double custoFinal = custoCarroImpostos + custoCarroDistribuidor + custoCarro;

        System.out.println ("O Custo final do carro é R$" + custoFinal);

    }

}

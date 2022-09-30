package ExerciciosLista1;
import java.util.Scanner;
public class VendaProduto {
    public void calcularCustoVenda {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println ("Informe o preço de custo deste produto");
        float custoProduto = meuScanner.nextFloat();

        System.out.println ("Informe o valor em % que será feito para o custo da venda");
        double porcentagemProduto = meuScanner.nextDouble();

        double vendaProduto = custoProduto * porcentagemProduto;

        System.out.println ("O valor da venda será de R$" + vendaProduto);
    }
}

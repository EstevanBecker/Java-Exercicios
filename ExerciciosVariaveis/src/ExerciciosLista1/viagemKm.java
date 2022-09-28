package ExerciciosLista1;
import java.util.Scanner;

public class viagemKm {

    public class CalculadoraKml {
        public void calcularKml() {
            float precoAlcool = 3.80F;
            float precoGasolina = 5.74F;

            System.out.println ("Informe o seu orçamento para essa viagem ");
            Scanner meuScanner = new Scanner (System.in);
            float orcamento = meuScanner.nextFloat();

            System.out.println ("Informe quantos Km terá essa viagem");
            float kmViagem = meuScanner.nextFloat();

            System.out.println("Quantos km por litro seu carro faz utilizando gasolina?");
            float gasolinaKml = meuScanner.nextFloat();

            System.out.println ("Informe quantos KM por litro de alcool seu carro faz?");
            float alcoolKml = meuScanner.nextFloat();

            float valorCombustivel = alcoolKml / gasolinaKml;
            float custoGasolina = precoGasolina * valorCombustivel;

            if (custoGasolina < precoAlcool) {
                CalculoGasolina(gasolinaKml, orcamento, kmViagem, precoGasolina);
            }
            else {
                CalculoAlcool(alcoolKml, orcamento, kmViagem, precoAlcool);
            }
        }
        public void CalculoGasolina (float gasolinaKml, float orcamento, float  kmViagem , float precoGasolina) {
            System.out.println(" A melhor opção é a gasolina");
            float calcGasolina = kmViagem / gasolinaKml;
            System.out.println("o seu carro vai precisar de " + calcGasolina + "Litros de gasolina para esta viagem");
            float calcGastoGasolina = calcGasolina * precoGasolina;
            System.out.println("O Gasto em dinheiro será de R$" +calcGastoGasolina);
            if (calcGastoGasolina > orcamento) {
                System.out.println("Fique em casa");
            }
            else {
                System.out.println("boraa");
            }
        }
        public void CalculoAlcool(float alcoolKml,float orcamento, float kmViagem, float precoAlcool) {
            System.out.println("A melhor opção é o Alcool");
            float calcKml = kmViagem / alcoolKml;
            System.out.println("O Seu carro vai precisar de,"+ calcKml + "Litros de alcool para esta viagem");
            float calcGastoAlcool = calcKml * precoAlcool;
            System.out.println(" o gasto em dinheiro será de R$" +calcGastoAlcool);
            if (calcGastoAlcool > orcamento) {
                System.out.println("Fique em casa");
            }
            else {
                System.out.print("Boraaa");
            }
        }
    }
}

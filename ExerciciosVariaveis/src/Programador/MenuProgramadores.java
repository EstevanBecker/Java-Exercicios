package Programador;

import java.util.Scanner;
public class MenuProgramadores {

    Scanner meuScanner = new Scanner(System.in); //declarar variavel Scanner para receber informações do usuário
    Programador[] listaDeProgramadores = {
            new Programador("Joao", 23, "Python"), //1
            new Programador("Roberto", 23, "Php"),
            new Programador ("Martina", 23, "Java")//2
    };


    public void listarProgramadores() {
        int i = 1;

        for (Programador listaDeProgramador : listaDeProgramadores) {
            System.out.print(i++ + ".");
            System.out.println (" Nome: " + listaDeProgramador.getNome() + " linguagem: " + listaDeProgramador.getLinguagem() + " idade: " +listaDeProgramador.getIdade());
        }
    }

    public void pesquisarProgramadores() {

        System.out.println ("Selecione um programador: ");
        int selecionar = meuScanner.nextInt();

        switch (selecionar) {
            case 1:
                System.out.println("você escolheu o Joao");
                break;
                case 2:
                    System.out.println ("voce escolheu o roberto");
                    break;
                    case 3:
                        System.out.println ("voce escolheu a Martina");
                        break;
            default:
                System.out.println("escolha um numero correto");
        }


    }

}

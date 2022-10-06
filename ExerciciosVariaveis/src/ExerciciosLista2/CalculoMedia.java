package ExerciciosLista2;
import java.util.Scanner;

public class CalculoMedia {
    Notas [] listaDeNotas = {
        new Notas ("Estevan", 1 ,6, 10, 9),
        new Notas ("Norton", 2, 10, 9, 8),
        new Notas ("Clenio", 3, 4, 8, 4)};

    Scanner meuScanner = new Scanner(System.in);

    public void listarAlunos() {
        int i = 1;
        for (Notas listaDeNotas: listaDeNotas){
            System.out.print(i++ + ".");
            System.out.println("Alunos:" + listaDeNotas.nomeAluno + "Turma:" + listaDeNotas.turmaAluno + "Notas:" + listaDeNotas.notaAluno + ", " + listaDeNotas.nota2Aluno + ", " + listaDeNotas.nota3Aluno);
        }
         selecionarAluno();
    }

    public void selecionarAluno(){
        int selecionar;
        System.out.println ("Selecione um código");
        selecionar = meuScanner.nextInt();

        switch (selecionar) {
            case 1 -> System.out.println("Você selecionou o aluno Estevan");
            case 2 -> System.out.println("Você selecionou o aluno Norton");
            case 3 -> System.out.println("Você selecionou o aluno Clenio");
            default -> {
                System.out.println("Você selecionou um aluno inexistente, tente novamente");
                selecionarAluno();
            }
        }
        calcularNotas(selecionar);
    }

    public void calcularNotas(int selecaoAluno) {
       Notas alunoEscolhido = listaDeNotas[selecaoAluno-1];
        double media = (alunoEscolhido.notaAluno + alunoEscolhido.nota2Aluno + alunoEscolhido.nota3Aluno / 3);
        System.out.println("A media desse aluno é: " + media);
        if (media > 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}

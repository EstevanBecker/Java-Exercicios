package br.com.jeanalves.caixaeletronico;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaEletronico {

    TipoCedula[] tiposCedulas = {
            new TipoCedula(100, 10),
            new TipoCedula(50, 10),
            new TipoCedula(10, 10),
            new TipoCedula(5, 10),
            new TipoCedula(1, 10)};

    public CaixaEletronico() {
    }

    public void imprimirEstadoAtual() {
        for (TipoCedula tipoCedula : tiposCedulas) {
            System.out.println("Cedula de valor " + tipoCedula.valor + " | Quantidade " + tipoCedula.quantidade);
        }
    }
    public void iniciar(){
        int opcao;
        do {
            exibirMenu();
            opcao = receberOpcao();
            if (opcao == 1) {
                sacar(receberValor(opcao));
            } else if (opcao == 2) {
                imprimirEstadoAtual();
                adicionarCedulas(receberQuantidade(),receberValor(opcao));
                imprimirEstadoAtual();
            } else if (opcao == 0) {
                System.out.println("Fim do programa!");
            }
        } while (opcao != 0);
    }
    private static int receberQuantidade() {
        Scanner scanner = new Scanner(System.in);
        int valor;
        try {
            System.out.println();
            System.out.println("Informe a quantidade de cédulas:");
            valor = scanner.nextInt();
            scanner.nextLine(); //para eliminar o /n do buffer
            if (valor < 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            System.out.println("CUIDADO, informe um número inteiro positivo!");
            valor = receberQuantidade();
        }
        return valor;
    }
    private static int receberValor(int opcao) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        try {
            System.out.println();
            if(opcao == 1){
                System.out.println("Informe o valor que deseja sacar:");
            } else if (opcao == 2) {
                System.out.println("Informe o valor da cédula que deseja repor:");
            }
            valor = scanner.nextInt();
            scanner.nextLine(); //para eliminar o /n do buffer
            if (valor < 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            System.out.println("CUIDADO, informe um número inteiro positivo!");
            valor = receberValor(opcao);
        }
        return valor;
    }
    private static int receberOpcao() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        try {
            System.out.println();
            System.out.println("Informe a opção");
            opcao = scanner.nextInt();
            scanner.nextLine(); //para eliminar o /n do buffer
            if (opcao < 0 || opcao > 2) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            System.out.println("CUIDADO, informe um número inteiro positivo!");
            opcao = receberOpcao();
        }
        return opcao;
    }
    public void exibirMenu() {
        System.out.println();
        System.out.println("O que deseja?");
        System.out.println("1 - Sacar");
        System.out.println("2 - Adicionar Cédulas");
        System.out.println("0 - Sair");

    }
    public void sacar(int valorTotal) {
        int valorFaltante = valorTotal;

        ArrayList<SimulacaoSaqueCedula> simulacoes = new ArrayList<>();
        for (TipoCedula tipoCedula : tiposCedulas) {
            SimulacaoSaqueCedula resultadoSimulacao = simularSaqueMaximoDesseTipoCedula(tipoCedula, valorFaltante);
            valorFaltante = resultadoSimulacao.resto;

            simulacoes.add(resultadoSimulacao);

            if (valorFaltante == 0) {
                break;
            }
        }

        if (valorFaltante > 0) {
            System.out.println("nao foi possivel sacar essa quantia! Faltou " + valorFaltante);
        } else {
            aplicarSaque(simulacoes);
        }
    }

    public void aplicarSaque(ArrayList<SimulacaoSaqueCedula> simulacoes) {
        // pra simulacao de cada tipo de cedula
        for (SimulacaoSaqueCedula simulacao : simulacoes) {
            // liberar quantidade necessaria pro cliente
            // atualizar valor restante dessa cedula no caixa eletronico
            liberarCedulas(simulacao.tipoCedula, simulacao.quantidadeUtilizada);
        }
    }

    public void liberarCedulas(TipoCedula tipoCedula, int quantidadeLiberada) {
        tipoCedula.quantidade = tipoCedula.quantidade - quantidadeLiberada;
        System.out.println("soltando " + quantidadeLiberada + " cedulas de " + tipoCedula.valor);
    }

    public SimulacaoSaqueCedula simularSaqueMaximoDesseTipoCedula(TipoCedula tipoCedula, int valorTotal) {
        //System.out.println("tentando sacar " + valorTotal + " em cedulas de " + tipoCedula.valor);

        int quantidadeNecessaria = valorTotal / tipoCedula.valor;
        int resto = valorTotal % tipoCedula.valor;

        if (quantidadeNecessaria > tipoCedula.quantidade) {
            int quantidadeFaltante = quantidadeNecessaria - tipoCedula.quantidade;
            int valorFaltante = quantidadeFaltante * tipoCedula.valor;
            resto = resto + valorFaltante;
            quantidadeNecessaria = tipoCedula.quantidade;
        }

        /*System.out.println("Deve liberar " + quantidadeNecessaria + " cedulas com valor " + tipoCedula.valor + " cada");
        System.out.println("Restou do valor total: " + resto);*/

        return new SimulacaoSaqueCedula(tipoCedula, resto, quantidadeNecessaria);
    }

    public void adicionarCedulas(int quantidadeAdicional, int valor) {
        if (validarTipoCedulaExistente(valor)) {
            TipoCedula tipoCedula = encontrarTipoCedulaPeloValor(valor);
            tipoCedula.quantidade = tipoCedula.quantidade + quantidadeAdicional;
        } else {
            System.out.println("não existe cedula de valor " + valor);
        }
    }

    public TipoCedula encontrarTipoCedulaPeloValor(int valor) {
        for (TipoCedula tipoCedula : tiposCedulas) {
            if (tipoCedula.valor == valor) {
                return tipoCedula;
            }
        }
        return null;
    }

    public boolean validarTipoCedulaExistente(int valor) {
        return encontrarTipoCedulaPeloValor(valor) != null;
    }
}

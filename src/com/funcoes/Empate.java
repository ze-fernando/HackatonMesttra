
package com.funcoes;

public class Empate {

    public static void exibirEmpate() {
        System.out.println("**********************************");
        System.out.println("*          Ocorreu empate!       *");
        System.out.println("**********************************");
        System.out.println("*                                *");
        System.out.println("*          ___     ___           *");
        System.out.println("*         |  0|   |0  |          *");
        System.out.println("*         |___| X |___|          *");
        System.out.println("*                                *");
        System.out.println("*          Placar: 0 X 0         *");
        System.out.println("*                                *");
        System.out.println("**********************************");
    }

    public static boolean teveEmpate(char[][] tabuleiro) {
        String posLivre = Tabuleiro.retornarPosicoesLivres(tabuleiro);

        if (posLivre == "") {
            return true;
        }
        return false;
    }

}
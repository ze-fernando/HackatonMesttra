package com.funcoes;

public class Tabuleiro {
    public static char[][] inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        return tabuleiro;
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Coluna:       1     2      3");
        for (int i = 0; i < 3; i++) {
            System.out.printf("linha %d   ", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("   %c", tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print("  |");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("          ------+------+------");
            }
        }
    }

    public static char[][] retornarTabuleiroAtualizado(char[][] tabuleiro, int[] jogada, char caractereJogador) {

        if (jogada == null || jogada.length != 2) {
            throw new IllegalArgumentException("A jogada deve conter exatamente dois valores: linha e coluna.");
        }

        int linha = jogada[0];
        int coluna = jogada[1];

        if (linha < 0 || linha >= tabuleiro.length || coluna < 0 || coluna >= tabuleiro[0].length) {
            throw new IndexOutOfBoundsException("Os índices da jogada estão fora dos limites do tabuleiro.");
        }

        if (tabuleiro[linha][coluna] != ' ') {
            throw new IllegalStateException("A posição já está ocupada. Escolha outra jogada.");
        }

        tabuleiro[linha][coluna] = caractereJogador;

        return tabuleiro;
    }

    public static String retornarPosicoesLivres(char[][] tabuleiro) {
        StringBuilder posicoesLivres = new StringBuilder();

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == ' ') {
                    if (posicoesLivres.length() > 0) {
                        posicoesLivres.append(";");
                    }

                    posicoesLivres.append((i + 1)).append(" ").append((j + 1));
                }
            }
        }

        return posicoesLivres.toString();
    }
}

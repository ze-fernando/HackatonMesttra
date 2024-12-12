package com.funcoes;

public class TeveGanha {
    public static boolean teveGanhador(char[][] tabuleiro, char caractereJogador) {
        // Verifica se há um ganhador em qualquer linha, coluna ou diagonal
        return teveGanhadorLinha(tabuleiro, caractereJogador) ||
               teveGanhadorColuna(tabuleiro, caractereJogador) ||
               teveGanhadorDiagonalPrincipal(tabuleiro, caractereJogador) ||
               teveGanhadorDiagonalSecundaria(tabuleiro, caractereJogador);
    }

    public static boolean teveGanhadorLinha(char[][] tabuleiro, char caractereJogador) {
        // Verifica as três linhas do tabuleiro
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == caractereJogador &&
                tabuleiro[i][1] == caractereJogador &&
                tabuleiro[i][2] == caractereJogador) {
                return true; // Linha `i` é ganhadora
            }
        }
        return false; // Nenhuma linha é ganhadora
    }

    public static boolean teveGanhadorColuna(char[][] tabuleiro, char caractereJogador) {
        // Verifica as três colunas do tabuleiro
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == caractereJogador &&
                tabuleiro[1][j] == caractereJogador &&
                tabuleiro[2][j] == caractereJogador) {
                return true; // Coluna `j` é ganhadora
            }
        }
        return false; // Nenhuma coluna é ganhadora
    }

    public static boolean teveGanhadorDiagonalPrincipal(char[][] tabuleiro, char caractereJogador) {
        // Verifica a diagonal principal (da esquerda superior para a direita inferior)
        return tabuleiro[0][0] == caractereJogador &&
               tabuleiro[1][1] == caractereJogador &&
               tabuleiro[2][2] == caractereJogador;
    }

    public static boolean teveGanhadorDiagonalSecundaria(char[][] tabuleiro, char caractereJogador) {
        // Verifica a diagonal secundária (da direita superior para a esquerda inferior)
        return tabuleiro[0][2] == caractereJogador &&
               tabuleiro[1][1] == caractereJogador &&
               tabuleiro[2][0] == caractereJogador;
    }
}

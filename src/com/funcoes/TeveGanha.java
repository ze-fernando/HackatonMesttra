package com.funcoes;

public class TeveGanha {
    public static boolean teveGanhador(char[][] tabuleiro, char caractereJogador) {
   
        return teveGanhadorLinha(tabuleiro, caractereJogador) ||
               teveGanhadorColuna(tabuleiro, caractereJogador) ||
               teveGanhadorDiagonalPrincipal(tabuleiro, caractereJogador) ||
               teveGanhadorDiagonalSecundaria(tabuleiro, caractereJogador);
    }

    public static boolean teveGanhadorLinha(char[][] tabuleiro, char caractereJogador) {
       
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == caractereJogador &&
                tabuleiro[i][1] == caractereJogador &&
                tabuleiro[i][2] == caractereJogador) {
                return true; // Linha `i` é ganhadora
            }
        }
        return false; 
    }

    public static boolean teveGanhadorColuna(char[][] tabuleiro, char caractereJogador) {
        
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == caractereJogador &&
                tabuleiro[1][j] == caractereJogador &&
                tabuleiro[2][j] == caractereJogador) {
                return true; // Coluna `j` é ganhadora
            }
        }
        return false; // 
    }

    public static boolean teveGanhadorDiagonalPrincipal(char[][] tabuleiro, char caractereJogador) {
       
        return tabuleiro[0][0] == caractereJogador &&
               tabuleiro[1][1] == caractereJogador &&
               tabuleiro[2][2] == caractereJogador;
    }

    public static boolean teveGanhadorDiagonalSecundaria(char[][] tabuleiro, char caractereJogador) {
       
        return tabuleiro[0][2] == caractereJogador &&
               tabuleiro[1][1] == caractereJogador &&
               tabuleiro[2][0] == caractereJogador;
    }
}

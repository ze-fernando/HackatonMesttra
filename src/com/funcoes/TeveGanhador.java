package com.funcoes;


public class TeveGanhador{
    public static boolean teveGanhador(char[][] tabuleiro, char caractereJogador) {
        if(teveGanhadorLinha(tabuleiro, caractereJogador) ||
        teveGanhadorLinha(tabuleiro, caractereJogador) ||
        teveGanhadorDiagonalPrincipal(tabuleiro, caractereJogador) ||
        teveGanhadorDiagonalSecundaria(tabuleiro, caractereJogador)){
            return true;
        }
        else{
            return false;
        }
    }


    public static boolean teveGanhadorLinha(char[][] tabuleiro, char caractereJogador) {
        //
    }

    public static boolean teveGanhadorColuna(char[][] tabuleiro, char caractereJogador) {
        //
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
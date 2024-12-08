package com.funcoes;
public static class TeveGanhador{
    public static boolean teveGanhador(char[][] tabuleiro, char caractereJogador) {
        if(teveGanhadorLinha(tabuleiro, caractereJogador) ||
        teveGanhadorLinha(tabuleiro, caractereJogador) ||
        teveGanhadorDiagonalPrincipal(tabuleiro, caractereJogador) ||
        teveGanhadorDiagonalSecudanria(tabuleiro, caractereJogador)){
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
        //
    }

    public static boolean teveGanhadorDiagonalSecundaria(char[][] tabuleiro, char caractereJogador) {
        //
    }
}
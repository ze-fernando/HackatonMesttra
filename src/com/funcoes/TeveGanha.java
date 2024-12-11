package com.funcoes;


public class TeveGanha{
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

        public  static boolean teveGanhadorLinha(char[][] tabuleiro, char caractereJogador) {
            // Como o tabuleiro é 3x3, verificamos manualmente as linhas
            // Verificando a primeira linha (linha 0)
            if (tabuleiro[0][0] == caractereJogador && tabuleiro[0][1] == caractereJogador && tabuleiro[0][2] == caractereJogador) {
                return true; // A linha 0 é ganhadora
            }
    
            // Verificando a segunda linha (linha 1)
            if (tabuleiro[1][0] == caractereJogador && tabuleiro[1][1] == caractereJogador && tabuleiro[1][2] == caractereJogador) {
                return true; // A linha 1 é ganhadora
            }
    
            // Verificando a terceira linha (linha 2)
            if (tabuleiro[2][0] == caractereJogador && tabuleiro[2][1] == caractereJogador && tabuleiro[2][2] == caractereJogador) {
                return true; // A linha 2 é ganhadora
            }
    
            // Se nenhuma linha for ganhadora
            return false;
        }
    

        public  static boolean GanhadorColuna(char[][] tabuleiro, char caractereJogador) {
            // Como o tabuleiro é 3x3, verificamos manualmente as linhas
            // Verificando a primeira linha (linha 0)
            if (tabuleiro[0][0] == caractereJogador && tabuleiro[1][0] == caractereJogador && tabuleiro[2][0] == caractereJogador) {
                return true; // A linha 0 é ganhadora
            }
    
            // Verificando a segunda linha (linha 1)
            if (tabuleiro[0][1] == caractereJogador && tabuleiro[1][1] == caractereJogador && tabuleiro[2][1] == caractereJogador) {
                return true; // A linha 1 é ganhadora
            }
    
            // Verificando a terceira linha (linha 2)
            if (tabuleiro[0][2] == caractereJogador && tabuleiro[1][2] == caractereJogador && tabuleiro[2][2] == caractereJogador) {
                return true; // A linha 2 é ganhadora
            }
    
            // Se nenhuma linha for ganhadora
            return false;
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
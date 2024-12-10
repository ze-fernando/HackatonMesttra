package com.funcoes;

public class Tabuleiro{

    //Inicializar tabuleiro com espaços
    public static char[][] inicializarTabuleiro(char[][] tabuleiro) {
            for (int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    tabuleiro[i][j] = ' ';
                }
            }

        return tabuleiro;
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            System.out.printf("linha %d   ", i +1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("   %c", tabuleiro[i][j]);
                if (j < 2) { // Não imprimir "|" na última coluna
                System.out.print("  |");
                }
            }
            System.out.println();
            if (i < 2)
                System.out.println("          ------+------+------");
        }
    }
    
    public static char[][] retornarTabuleiroAtualizado(char[][] tabuleiro, int[] jogada, char caractereJogador) {
        if (jogada[0] < 0 || jogada[0] >= tabuleiro.length || 
            jogada[1] < 0 || jogada[1] >= tabuleiro[0].length) {
            throw new IllegalArgumentException("JOGADA FORA DOS LIMITES DO TABULEIRO!");
        }
        
        if (tabuleiro[jogada[0]][jogada[1]] != '-') { // '-'posição vazia
            throw new IllegalStateException("A POSIÇÃO JÁ TA OCUPADAA!");
        }
    
        tabuleiro[jogada[0]][jogada[1]] = caractereJogador;
    
        return tabuleiro;
     }    
}
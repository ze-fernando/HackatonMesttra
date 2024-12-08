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
}
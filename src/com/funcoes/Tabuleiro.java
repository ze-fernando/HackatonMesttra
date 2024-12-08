package com.funcoes;


public class Tabuleiro {
    /*
     * Descrição: Utilizado para iniciar a matriz/tabuleiro com o caractere ' '
     * espaço, no início do jogo. Matrizes de char precisam ter um valor
     * diferente de '' vazio. A idéia é, se tiver ' ' espaço, a posição está
     * livre. Qualquer outro caractere presente na posição, representa o
     * caractere do jogador em questão: usuário ou computador. Um exemplo seria,
     * 'X' para usuário e 'O' para computador. Para o primeiro nível de
     * complexidade considere um tabuleiro apenas de tamanho 3x3, 3 linhas e 3
     * colunas. Depois de atualizar o tabuleiro com os valores, retorne o mesmo
     * com o comando return
     * Nível de complexidade: 3 de 10
     */

     //função para inicializar o tabuleiro jogo da velha
    public static char[][] inicializarTabuleiro(char[][] tabuleiro) {

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
            }
        }
        return tabuleiro;
    }
        /*
     * Descrição: Utilizado para imprimir o tabuleiro o conteúdo do tabuleiro na
     * tela. Recebe o tabuleiro como parametro e imprime o conteúdo de cada posição
     * do tabuleiro na tela. Imprimi o conteúdo no formato de uma grade. Para o
     * primeiro nível de complexidade considere um tabuleiro apenas de tamanho 3x3,
     * 3 linhas e 3 colunas.
     * Nível de complexidade: 4 de 10
     */
    public static void exibirTabuleiro(char[][] tabuleiro) {
        // TODO: execute no início deste método a chamada ao método limparTela
        // para garantir que seja exibido o tabuleiro sem nenhum conteúdo antes dele.
        System.out.println("coluna:       1     2      3");
        for(int i = 0; i < 3; i ++){
            System.out.printf("linha %d   ", i+1);
            for(int j = 0; j < 3; j ++){
                System.out.printf("   %c",tabuleiro[i][j]);
                if (j < 2) { // Não imprimir "|" na última coluna
                System.out.print("  |");
            }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("          ------+------+------");
            }
        }
    }

    static String retornarPosicoesLivres(char[][] tabuleiro) {
        StringBuilder posicoesLivres = new StringBuilder(); // Usar StringBuilder para manipular a string.

        // Percorrer cada posição no tabuleiro.
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == ' ') { // Verifica se a posição está livre (representada por um espaço vazio ' ').
                    if (posicoesLivres.length() > 0) {
                        posicoesLivres.append(";"); // Adiciona um separador caso já existam posições livres.
                    }
                    posicoesLivres.append(i).append(j); // Adiciona a posição no formato xy.
                }
            }
        }

        return posicoesLivres.toString(); // Retorna a string contendo as posições livres.
    }
}    
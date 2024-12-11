package com.funcoes;

public class Posicoes{
    public static String retornarPosicoesLivres(char[][] tabuleiro){
        StringBuilder posicoesLivres = new StringBuilder();

        
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == ' ') {
                    if (posicoesLivres.length() > 0) {
                        posicoesLivres.append(";");
                    }
                    posicoesLivres.append(i).append(j);
                }
            }
        }

        return posicoesLivres.toString();
    }
}
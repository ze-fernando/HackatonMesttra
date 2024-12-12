package com.funcoes;

import java.util.Random;
import java.util.Scanner;

public class ObterJogadas {
    static int[] obterJogadaUsuario(String posicoesLivres, Scanner teclado) {
        int[] jogada = new int[2]; //armazenar a linha e a coluna

        while (true) {
            System.out.println("Digite a jogada (exemplo: 1 1, 2 3, etc): ");
            String input = teclado.nextLine().trim(); 

            if (input.matches("\\d+ \\d+")) {
                String[] partes = input.split(" ");
                int linha = Integer.parseInt(partes[0]) - 1; 
                int coluna = Integer.parseInt(partes[1]) - 1; 

                if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
                    
                    if (jogadaValida(posicoesLivres, linha, coluna)) {
                        jogada[0] = linha;
                        jogada[1] = coluna;
                        break; 
                    } else {
                        System.out.println("Jogada inválida! A posição não está mais disponível.");
                    }
                } else {
                    System.out.println("Jogada inválida! Os valores devem ser entre 1 e 3.");
                }
            } else {
                System.out.println("Entrada inválida! Digite dois números separados por espaço.");
            }
        }

        return jogada;
    }

    public static int[] obterJogadaComputador(String posicoesLivres, Scanner teclado) {
        if (posicoesLivres == null || posicoesLivres.trim().isEmpty()) {
            throw new IllegalArgumentException("Posições livres não podem estar vazias.");
        }
        // Divide a string de posições livres em um vetor
        String[] vetorPosicoes = posicoesLivres.split(";");
        Random rd = new Random();

        int indiceSorteado = rd.nextInt(vetorPosicoes.length);

        return converterJogadaStringParaVetorInt(vetorPosicoes[indiceSorteado]);
    }

    public static int[] converterJogadaStringParaVetorInt(String jogada) {

        if (jogada == null || jogada.trim().isEmpty()) {
            throw new IllegalArgumentException("Formato da jogada inválido.");
        }

        jogada = jogada.trim();

        String[] partes = jogada.split(" ");

        int[] resultado = new int[2];

        try {
            resultado[0] = Integer.parseInt(partes[0]) - 1; // Linha (1-3) -> índice (0-2)
            resultado[1] = Integer.parseInt(partes[1]) - 1; // Coluna (1-3) -> índice (0-2)
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato da jogada inválido. A linha e a coluna devem ser números.");
        }

        return resultado;
    }

    public static boolean jogadaValida(String posicoesLivres, int linha, int coluna) {
  
        String posicao = (linha + 1) + " " + (coluna + 1);

        return posicoesLivres.contains(posicao);
    }
}

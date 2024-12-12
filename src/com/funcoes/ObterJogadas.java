package com.funcoes;

import java.util.Random;
import java.util.Scanner;

public class ObterJogadas {
    static int[] obterJogadaUsuario(String posicoesLivres, Scanner teclado) {
        int[] jogada = new int[2]; // Array para armazenar a linha e a coluna

        while (true) {
            System.out.println("Digite a jogada (exemplo: 1 1, 2 3, etc): ");
            String input = teclado.nextLine().trim(); // Lê a entrada do usuário

            // Verifica se a entrada contém dois números
            if (input.matches("\\d+ \\d+")) {
                String[] partes = input.split(" ");
                int linha = Integer.parseInt(partes[0]) - 1; // Converte para índice 0-2
                int coluna = Integer.parseInt(partes[1]) - 1; // Converte para índice 0-2

                // Verifica se a jogada está dentro dos limites
                if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
                    // Verifica se a jogada é válida
                    if (jogadaValida(posicoesLivres, linha, coluna)) {
                        jogada[0] = linha;
                        jogada[1] = coluna;
                        break; // Sai do loop quando a jogada for válida
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

    /*
     * Método para obter a jogada do computador, que escolhe uma posição aleatória
     * da lista de posições livres.
     */
    public static int[] obterJogadaComputador(String posicoesLivres, Scanner teclado) {
        // Verifica se a string de posições livres não está vazia
        if (posicoesLivres == null || posicoesLivres.trim().isEmpty()) {
            throw new IllegalArgumentException("Posições livres não podem estar vazias.");
        }

        // Divide a string de posições livres em um vetor
        String[] vetorPosicoes = posicoesLivres.split(";");
        Random rd = new Random();

        // Sorteia uma posição aleatória
        int indiceSorteado = rd.nextInt(vetorPosicoes.length);

        // Converte a posição sorteada de string para um vetor de inteiros
        return converterJogadaStringParaVetorInt(vetorPosicoes[indiceSorteado]);
    }

    public static int[] converterJogadaStringParaVetorInt(String jogada) {
        // Verifica se a string é nula ou vazia
        if (jogada == null || jogada.trim().isEmpty()) {
            throw new IllegalArgumentException("Formato da jogada inválido.");
        }

        // Remove espaços extras
        jogada = jogada.trim();

        // Divide a string de jogada em linha e coluna
        String[] partes = jogada.split(" ");

        // Cria um vetor de inteiros com os valores da linha e coluna
        int[] resultado = new int[2];

        // Converte os valores de linha e coluna de 1-3 para 0-2
        try {
            resultado[0] = Integer.parseInt(partes[0]) - 1; // Linha (1-3) -> índice (0-2)
            resultado[1] = Integer.parseInt(partes[1]) - 1; // Coluna (1-3) -> índice (0-2)
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato da jogada inválido. A linha e a coluna devem ser números.");
        }

        return resultado;
    }

    public static boolean jogadaValida(String posicoesLivres, int linha, int coluna) {
        // Converte linha e coluna para formato de string "linha coluna"
        String posicao = (linha + 1) + " " + (coluna + 1);

        // Verifica se a posição está contida nas posições livres
        return posicoesLivres.contains(posicao);
    }
}

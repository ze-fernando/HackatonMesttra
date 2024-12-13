package com.funcoes;

import java.util.Random;
import java.util.Scanner;

public class Processar {

    public static char[][] processarVezUsuario(Scanner teclado, char[][] tabuleiro, char caractereUsuario) {
        System.out.println("É A VEZ DO USUÁRIO JOGAR!");
        
        String positions = Tabuleiro.retornarPosicoesLivres(tabuleiro);
        int[] jogada = ObterJogadas.obterJogadaUsuario(positions, teclado);

        tabuleiro = Tabuleiro.retornarTabuleiroAtualizado(tabuleiro, jogada, caractereUsuario);

        return tabuleiro;
    }

    public static char[][] processarVezComputador(char[][] tabuleiro, char caractereComputador) {

        String posicoesLivres = Tabuleiro.retornarPosicoesLivres(tabuleiro);
        Scanner teclado = new Scanner(System.in);

        int[] jogada = ObterJogadas.obterJogadaComputador(posicoesLivres, teclado);

        tabuleiro = Tabuleiro.retornarTabuleiroAtualizado(tabuleiro, jogada, caractereComputador);

        return tabuleiro;
    }

    public static boolean sortearValorBooleano() {
        Random rd = new Random();
        boolean valor = rd.nextBoolean();

        return valor;
    }

    public static void limparTela() {
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {

                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("Não foi possível limpar a tela: " + e.getMessage());
        }
    }

}

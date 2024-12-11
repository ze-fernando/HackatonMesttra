package com.funcoes;
import java.util.Scanner;
import com.funcoes.Posicoes;
import com.funcoes.ObterJogadas;

    public class Processar {
    
    public static char[][] processarVezUsuario(Scanner teclado, char[][] tabuleiro, char caractereUsuario) {
        System.out.println("É A VEZ DO USUÁRIO JOGAR!");
        char jogadaUsuario;
        String positions = Posicoes.retornarPosicoesLivres(tabuleiro);
        int[] jogada = ObterJogadas.obterJogadaUsuario(positions, teclado);

        return Tabuleiro.retornarTabuleiroAtualizado(tabuleiro, jogada, caractereUsuario);
}

   
    public static char[][] processarVezComputador(char[][] tabuleiro, char caractereComputador) {

        char jogadaComputador;
        String positionsPc = Posicoes.retornarPosicoesLivres(tabuleiro);

        int[] jogada = ObterJogadas.obterJogadaComputador(positionsPc, null);

        return Tabuleiro.retornarTabuleiroAtualizado(tabuleiro, jogada, caractereComputador);
 
    }
}
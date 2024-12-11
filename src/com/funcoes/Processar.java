package com.funcoes;
import java.util.Scanner;

    public class Processar {
    
        public static char[][] processarVezUsuario(Scanner teclado, char[][] tabuleiro, char caractereUsuario) {
            System.out.println("É A VEZ DO USUÁRIO JOGAR!");
            // char jogadaUsuario;
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
}
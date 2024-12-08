package com.funcoes;
import com.funcoes.Tabuleiro;


public class Empate{

    public static void exibirEmpate(){
        //
    }

    public static boolean teveEmpate(char[][] tabuleiro){
        public String posLivre = retornarPosicoesLivres(tabuleiro);

        if(posLivre == "Nenhuma Posição Livre"){
            return true;
        }
        return false;
    }


}
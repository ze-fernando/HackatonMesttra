
import java.util.Random;
import java.util.Scanner;

import com.funcoes.*;


public class JogoVelha {

    final static String CARACTERES_IDENTIFICADORES_ACEITOS = "XO0UC";

    final static int TAMANHO_TABULEIRO = 3;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rd = new Random();

        char[][] tabuleiro = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
        Tabuleiro.inicializarTabuleiro(tabuleiro);
        // Definimos aqui qual é o caractere que cada jogador irá utilizar no jogo.
        //TODO: chame as funções obterCaractereUsuario() e obterCaractereComputador
        //para definir quais caracteres da lista de caracteres aceitos que o jogador
        //quer configurar para ele e para o computador. 
        ObterCaractere obterCaractere = new ObterCaractere();

        System.out.println("Digte o caracter que você quer utilizar [X] [O] [0] [U] [C]: ");
        char caractereUsuario = ObterCaractere.obterCaractereUsuario(teclado);
        System.out.println("Digte o caracter que o computador irá utilizar [X] [O] [0] [U] [C]: ");
        char caractereComputador = ObterCaractere.obterCaractereComputador(teclado, caractereUsuario);

        // Esta variavel é utilizada para definir se o usuário começa a jogar ou não.
        // Valor true, usuario começa jogando, valor false computador começa.
        //TODO: obtenha o valor booleano sorteado
      

        boolean vezUsuarioJogar = rd.nextBoolean();

        boolean jogoContinua;

        do {
            // controla se o jogo terminou
            jogoContinua = true;
            //TODO: Exiba o tabuleiro aqui
            Tabuleiro.exibirTabuleiro(tabuleiro);

            if ( vezUsuarioJogar){
               Processar.processarVezUsuario(teclado, tabuleiro, caractereUsuario);

                // Verifica se o usuario venceu
                //TODO: Este if deve executar apenas se teve ganhador 
                if ( TeveGanha.teveGanhador(tabuleiro, caractereUsuario) ) {
                    //TODO: Exiba que o usuario ganhou
                    Vitoria.exibirVitoriaUsuario();
                    jogoContinua = false;
                }

                //TODO: defina qual o vaor a variavel abaixo deve possuir
                vezUsuarioJogar = false;
                jogoContinua = true;
            } else {

                //TODO: Execute processar vez do computador
                tabuleiro = Processar.processarVezComputador(tabuleiro, caractereComputador);
                // Processar.processarVezComputador(tabuleiro, caractereComputador);
                // Verifica se o computador venceu
                //TODO: Este if deve executar apenas se teve ganhador
                if (TeveGanha.teveGanhador(tabuleiro, caractereComputador)) {
                    Vitoria.exibirVitoriaComputador();
                    //TODO: Exiba que o computador ganhou
                    jogoContinua = false;
                }

                //TODO: defina qual o vaor a variavel abaixo deve possuir
                vezUsuarioJogar = true;
                jogoContinua = true;
            }
        
            //TODO: Este if deve executar apenas se o jogo continua E 
            //ocorreu tempate. Utilize o metodo teveEmpate()
            if ( jogoContinua && Empate.teveEmpate(tabuleiro)) {
                Empate.exibirEmpate();
                //TODO: Exiba que ocorreu empate
                jogoContinua = false;
            }
        } while (jogoContinua);

        teclado.close();
    }
}

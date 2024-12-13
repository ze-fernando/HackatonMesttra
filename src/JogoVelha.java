import java.util.Scanner;
import com.funcoes.*;

public class JogoVelha {
    final static String CARACTERES_IDENTIFICADORES_ACEITOS = "XO0UC";
    final static int TAMANHO_TABULEIRO = 3;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char[][] tabuleiro = Tabuleiro.inicializarTabuleiro(new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO]);

        System.out.println("Digite o caractere que você quer utilizar [X] [O] [0] [U] [C]: ");
        char caractereUsuario = ObterCaractere.obterCaractereUsuario(teclado);

        System.out.println("Digite o caractere que o computador irá utilizar [X] [O] [0] [U] [C]: ");
        char caractereComputador = ObterCaractere.obterCaractereComputador(teclado, caractereUsuario);

        boolean vezUsuarioJogar = Processar.sortearValorBooleano();

        boolean jogoContinua;
        
        do {
            jogoContinua = true;
            Processar.limparTela();

            Tabuleiro.exibirTabuleiro(tabuleiro);

            if (vezUsuarioJogar) {
                tabuleiro = Processar.processarVezUsuario(teclado, tabuleiro, caractereUsuario);

                if (TeveGanha.teveGanhador(tabuleiro, caractereUsuario)) {
                    Vitoria.exibirVitoriaUsuario();
                    jogoContinua = false;
                }

                vezUsuarioJogar = false;

            } else {
                tabuleiro = Processar.processarVezComputador(tabuleiro, caractereComputador);

                if (TeveGanha.teveGanhador(tabuleiro, caractereComputador)) {
                    Vitoria.exibirVitoriaComputador();
                    jogoContinua = false;
                }

                vezUsuarioJogar = true;
            }

            if (jogoContinua && Empate.teveEmpate(tabuleiro)) {
                Empate.exibirEmpate();
                jogoContinua = false;
            }
        } while (jogoContinua);

        teclado.close();
    }
}


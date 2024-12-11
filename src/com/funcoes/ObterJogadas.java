package com.funcoes;
import java.util.Random;
import java.util.Scanner;


public class ObterJogadas {
    public static int[] obterJogadaUsuario(String posicoesLivres, Scanner teclado) {
        System.out.println("Digite dois valores seprados por espaço LINHA COLUNA: ");
        String jogada = teclado.nextLine();
        int[] jogadaInt = new int[2];
        if(posicoesLivres.contains(jogada) && posicoesLivres.contains(jogada)){
            jogadaInt = converterJogadaStringParaVetorInt(jogada);
        }
        else{
            System.out.println("Jogada inválida");
        }
        
        return jogadaInt;
    }
        public static int[] obterJogadaComputador(String posicoesLivres, Scanner teclado) {
            //dividir a string de posições livres em um vetor de string
            String[] vetorPoscoes = posicoesLivres.split(";");

            Random rd = new Random();
            int indiceSorteado = rd.nextInt(vetorPoscoes.length);

            String jogadaSorteada = vetorPoscoes[indiceSorteado];


            return converterJogadaStringParaVetorInt(jogadaSorteada);
    }
    
    public static int[] converterJogadaStringParaVetorInt(String jogada) {
        // Validar se a jogada está no formato correto (exemplo: "A 1")
        if (jogada == null || jogada.trim().isEmpty()) {
            throw new IllegalArgumentException("Entrada inválida. Use o formato A 1, B 2, etc.");
        }

        // Dividir a jogada em linha e coluna
        String[] partes = jogada.trim().split("\\s+"); // Divide pelo espaço
        if (partes.length != 2) {
            throw new IllegalArgumentException("Entrada inválida. Certifique-se de usar o formato LINHA COLUNA.");
        }

        String linhaStr = partes[0].toUpperCase(); // Exemplo: "A"
        String colunaStr = partes[1];             // Exemplo: "1"

        int linha, coluna;

        // Validar e converter linha (A, B, C)
        switch (linhaStr) {
            case "A": linha = 0; break;
            case "B": linha = 1; break;
            case "C": linha = 2; break;
            default:
                throw new IllegalArgumentException("Linha inválida. Use A, B ou C.");
        }

        // Validar e converter coluna (1, 2, 3)
        if (colunaStr.matches("[1-3]")) {
            coluna = Integer.parseInt(colunaStr) - 1;
        } else {
            throw new IllegalArgumentException("Coluna inválida. Use valores de 1 a 3.");
        }

        // Retornar as coordenadas da matriz
        return new int[] { linha, coluna };
    }

        // static int[] converterJogadaStringParaVetorInt(String jogada){
        //    int[] resultado = new int[2];

        //    resultado[0] = Character.getNumericValue(jogada.charAt(0));

        //     return resultado;
        // }

    public static boolean jogadaValida(String posicoesLivres, int linha, int coluna) {
        String posicao = Integer.toString(linha) + Integer.toString(coluna); //converte o valor da linha e coluna em String e junta as duas para formar a posicao
        
        return posicoesLivres.contains(posicao); // verifica se a posicao está contida dentro de posicoesLivres, se sim retorna true, se não retorna false
    
    }

}

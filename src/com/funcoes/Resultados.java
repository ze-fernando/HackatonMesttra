package com.funcoes;

public class Resultados {
    /*
     * Descrição: Utilizado para exibir a frase: Ocorreu empate!, e uma ART ASCII
     * do placar 0 X 0. Este método é utilizado quando é identificado que ocorreu
     * empate. Lembre-se que para imprimir uma contrabarra \ é necessário duas contra
     * barras \\
     */
    static void exibirEmpate() {
        System.out.println("**********************************");
        System.out.println("*          Ocorreu empate!       *");
        System.out.println("**********************************");
        System.out.println("*                                *");
        System.out.println("*          ___     ___           *");
        System.out.println("*         |  0|   |0  |          *");
        System.out.println("*         |___| X |___|          *");
        System.out.println("*                                *");
        System.out.println("*          Placar: 0 X 0         *");
        System.out.println("*                                *");
        System.out.println("**********************************");
    }

}

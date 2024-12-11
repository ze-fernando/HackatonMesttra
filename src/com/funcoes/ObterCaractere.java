package com.funcoes;

import java.util.Scanner;

public class ObterCaractere {
    public static char obterCaractereUsuario(Scanner teclado) {
        while (true) {
            try {
                System.out.println("Escolha o seu caractere:");

                char entrada = teclado.nextLine().toUpperCase().charAt(0);

                if (isValid(entrada)) {
                    return entrada; // Retorna o caractere válido escolhido pelo usuário
                }

                System.out.println("Entrada inválida. Por favor, escolha um caractere válido.");
            } catch (Exception e) {
                System.out.println("Erro ao ler a entrada. Tente novamente.");
                teclado.nextLine(); // Limpa a entrada em caso de erro
            }
        }
    }

    public static char obterCaractereComputador(Scanner teclado, char caractereUsuario) {
        while (true) {
            char entrada = teclado.nextLine().toUpperCase().charAt(0);

            if(isValid(entrada)){
                if (entrada == caractereUsuario) {
                    System.out.println("Caractere já escolhido, selecione outro!");
                }
                else {
                    return entrada;
                }

            }
             else{
              System.out.println("Caractere invalido, selecione outro!");
             }
        }
    }

    static boolean isValid(char entrada){
     if(entrada == 'X' || entrada == 'O'|| 
         entrada == '0' ||entrada == 'U'|| entrada == 'C'){
        return true;
    }
    return false;
    }
}

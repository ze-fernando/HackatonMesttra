package com.funcoes;
import java.util.Scanner;

public class ObterCaractere {
    public static char obterCaractereUsuario(Scanner teclado) {
        final char[] CARACTERES_IDENTIFICADORES_ACEITOS = {'X', 'O', '0', 'U', 'C'} ;

        while (true) {
            try {
                System.out.println("Escolha o seu caractere:");

                String entrada = teclado.nextLine().toUpperCase();

                if (entrada.length() == 1 && (entrada.charAt(0) == 'X' || entrada.charAt(0) == 'O' || 
                    entrada.charAt(0) == '0'  || entrada.charAt(0) == 'U' || entrada.charAt(0) == 'C')) {
                    return entrada.charAt(0); // Retorna o caractere válido escolhido pelo usuário
                }

                System.out.println("Entrada inválida. Por favor, escolha um caractere válido.");
            } catch (Exception e) {
                System.out.println("Erro ao ler a entrada. Tente novamente.");
                teclado.nextLine(); // Limpa a entrada em caso de erro
            }
        }
    }

    public static char obterCaractereComputador(Scanner teclado, char caractereUsuario) {
        final char[] CARACTERES_IDENTIFICADORES_ACEITOS = {'X', 'O', '0', 'U', 'C'};

        try {
            for (char caractere : CARACTERES_IDENTIFICADORES_ACEITOS) {
                if (caractere != caractereUsuario) {
                    return caractere; // Retorna o caractere que não foi escolhido pelo usuário
                }
            }

            throw new IllegalStateException("Nenhum caractere válido disponível para o computador.");
        } catch (Exception e) {
            System.out.println("Erro ao determinar o caractere do computador: " + e.getMessage());
            throw e; // Relança a exceção para informar o erro de forma clara
        }
    }
}

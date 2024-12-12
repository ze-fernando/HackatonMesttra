package com.funcoes;
import java.util.Scanner;

public class ObterCaracterComputador {
    static char obterCaractereComputador(Scanner teclado, char caractereUsuario) {
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

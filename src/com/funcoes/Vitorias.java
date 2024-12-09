public class Vitorias {

    // Método principal
    public static void main(String[] args) {
        // Chamando as duas funções
        exibirVitoriaComputador();
        exibirVitoriaUsuario();
    }

    /* Descrição: Utilizado para exibir a frase: O computador venceu!, e uma ART ASCII do computador feliz. Este método é utilizado quando é identificado que o computador venceu a partida. */
    static void exibirVitoriaComputador() {
        // Exibindo mensagem de vitória
        System.out.println("O computador venceu!!");

        // Exibindo uma arte ASCII representando um computador feliz
        System.out.println("         .----.\n" + 
                       "      .---------. | == |\n" +
                       "      |.-\"\"\"\"\"-.| |----|\n" +
                       "      || ^   ^ || | == |\n" +
                       "      ||  \\_/  || |----|\n" +
                       "      |'-.....-'| |::::|\n" +
                       "      `\")---(\"\"` |___.|\n" +
                       "     /:::::::::::\\\\\" \"\n" +
                       "    /:::=======:::\\\\\n" +
                       "    `\"\"\"\"\"\"\"\"\"\"\"\"\"`");
    }

    /* Descrição: Utilizado para exibir a frase: O usuário venceu!, e uma ART ASCII do usuário feliz. Este método é utilizado quando é identificado que o usuário venceu a partida. */
    static void exibirVitoriaUsuario() {
        // Exibindo mensagem de vitória
        System.out.println("O usuário venceu!");

        // Exibindo uma arte ASCII representando um usuário feliz
        System.out.println("         \\o/\n" + 
                       "          | \n" +
                       "         / \\\n" +
                       "  ------------------\n" +
                       "     `- HAPPY -'   ");
    }
}

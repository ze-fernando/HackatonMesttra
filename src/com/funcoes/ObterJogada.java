public static class ObterJogada{
    public static int[] obterJogadaUsuario(String posicoesLivres, Scanner teclado) {
        System.out.println("Digite dois valores seprados por espaço LINHA COLUNA: ");
        String jogada = teclado.nextLine();
        if(posicoesLivres.contains(jogada[0]) && posicoesLivres.contains(jogada[1])){
            int[] jogadaInt = converterJogadaStringParaVetorInt(jogada);
        }
        else{
            System.out.println("Jogada inválida");
        }
        
        return jogadaInt;
    }

    public static int[] obterJogadaComputador(String posicoesLivres, Scanner teclado) {
        //
    }
}
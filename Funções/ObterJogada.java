public static class ObterJogada{
    public static int[] obterJogadaUsuario(String posicoesLivres, Scanner teclado) {
        System.out.println(posicoesLivres);
        String jogada = teclado.nextLine();
        int[] jogadaInt = converterJogadaStringParaVetorInt(jogada);
        
        return jogadaInt;
    }

    public static int[] obterJogadaComputador(String posicoesLivres, Scanner teclado) {
        //
    }
}
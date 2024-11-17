public class TestePalavra {
    public static void main(String[] args) {
        try {
            Palavra palavra = new Palavra("PROGRAMACAO");

            System.out.println("Tamanho da palavra: " + palavra.getTamanho());

            System.out.println("Quantidade de 'A': " + palavra.getQuantidade('A'));
            System.out.println("Quantidade de 'O': " + palavra.getQuantidade('O'));
            System.out.println("Quantidade de 'Z': " + palavra.getQuantidade('Z'));

            System.out.println("Primeira posição de 'A': " + palavra.getPosicaoDaIezimaOcorrencia(0, 'A'));
            System.out.println("Segunda posição de 'A': " + palavra.getPosicaoDaIezimaOcorrencia(1, 'A'));

            try {
                System.out.println(palavra.getPosicaoDaIezimaOcorrencia(2, 'A'));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Palavra: " + palavra);

            Palavra outraPalavra = new Palavra("PROGRAMACAO");
            System.out.println("Palavras iguais? " + palavra.equals(outraPalavra));

            Palavra menorPalavra = new Palavra("JAVA");
            System.out.println("Comparação (PROGRAMACAO > JAVA): " + palavra.compareTo(menorPalavra));
            System.out.println("Comparação (PROGRAMACAO = PROGRAMACAO): " + palavra.compareTo(outraPalavra));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
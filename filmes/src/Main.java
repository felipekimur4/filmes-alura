public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Anime: Bleach");

        int anoDeLancamento = 2004;

        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme;

        double media = (8.7 + 7.8 + 9.0) / 3;

        System.out.println(media);

        String sinopse;
        sinopse = """
                  O jovem Ichigo, depois de passar grande parte de sua vida vendo fantasmas, se torna um Shinigami,
                  um ser sobrenatural capaz de controlar a morte. Devido a isso
                  ele dedica sua vida a proteger os inocentes e ajudar os espíritos torturados até que eles encontrem a paz.
                  """;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
    }
}
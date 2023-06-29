public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2004;
        boolean incluidoNoPlano = false;
        double notaDoFilme;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2023) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Filme negado. Necessário fazer upgrade no seu plano.");
        }
    }
}

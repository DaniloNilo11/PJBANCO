import java.net.URI;
import java.net.URISyntaxException;


public class Main {
    public static void main(String[] args) throws URISyntaxException {
        final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBancodoBrasil());

        URI caminhoArquivo = Main.class.getResource("banco-brasil-1.csv").toURI();
        System.out.println("Lendo arquivo " + caminhoArquivo + "\n");

        processador.processar(caminhoArquivo);
    }
}
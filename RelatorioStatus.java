import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RelatorioStatus {

    public static void gerarRelatorio(ArrayList<Jaula> jaulas, int dia, String nomeJogador) {
        // Cria a pasta com o nome do jogador (caso não exista)
        File pasta = new File("relatorios/" + nomeJogador);
        if (!pasta.exists()) {
            boolean criada = pasta.mkdirs();
            if (criada) {
                System.out.println("Pasta criada com sucesso!");
            } else {
                System.out.println("Falha ao criar a pasta!");
            }
        }

        // Define o caminho completo do arquivo
        String nomeArquivo = "relatorios/" + nomeJogador + "/relatorio_dia_" + dia + ".txt";

        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("Relatório do Zoológico - Dia " + dia + "\n");

            for (Jaula jaula : jaulas) {
                Animal animal = jaula.getAnimal();
                writer.write(animal.getEspecie() + "\n");
                writer.write("Felicidade: " + animal.getFelicidade() + "\n");
                writer.write("Fome: " + animal.getFome() + "\n");
                writer.write("Saúde: " + animal.getStatusSaude() + "\n\n");
            }

            System.out.println("Relatório do Dia " + dia + " salvo em: " + nomeArquivo);

        } catch (IOException e) {
            System.out.println("Erro ao salvar o relatório: " + e.getMessage());
        }
    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe responsável por gerar relatórios diários do zoológico.
 * Cada relatório salva o estado dos animais em um arquivo de texto,
 * armazenado em uma pasta com o nome do jogador.
 *
 * @author Rafael e Luana
 * @version 1.0
 */
public class RelatorioStatus {

    /**
     * Gera um relatório com o estado atual de cada animal nas jaulas.
     * O relatório é salvo em um arquivo de texto, organizado por dia e por jogador.
     *
     * @param jaulas Lista de jaulas do zoológico.
     * @param dia Número do dia atual da simulação.
     * @param nomeJogador Nome do jogador (utilizado para criar a pasta do relatório).
     */
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

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal do simulador de zoológico.
 * Permite ao jogador interagir com os animais e jaulas ao longo de 7 dias,
 * podendo analisar, alimentar, interagir e tratar os animais, além de limpar as jaulas.
 *
 * @author Rafael e Luana
 * @version 1.0
 */
public class MenuSimulador {

    /**
     * Método principal que executa o jogo.
     * Controla o fluxo diário de interações com os animais e jaulas.
     *
     * @param args argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        Cuidador cuidador = new Cuidador();
        Zoologico zoo = new Zoologico();
        int contador = 1;

        System.out.println("Bem-vindo(a) ao nosso Simulador de Zoologico!!");
        System.out.print("Como podemos chamar voce, jogador? ");
        String nomeJogador = nome.nextLine();

        System.out.println("Aqui voce pode, interagrir, alimentar,tratar e analizar os animais!");
        System.out.println("Fique atento com os status do animais e os alimente corretamente!");
        System.out.println("Boa sorte " + nomeJogador + "! Voce tem 7 dias para provar o seu valor!");

        // Loop principal de 7 dias
        while (contador <= 7) {
            System.out.println("Dia " + contador);

            ArrayList<Jaula> jaulas = zoo.getJaulas();
            for (Jaula jaula : jaulas) {
                boolean continuarJaula = true;

                // Menu de opções para cada jaula
                while (continuarJaula) {
                    System.out.println("\n" + jaula.toString());
                    System.out.println("O que quer fazer aqui?");
                    System.out.println("1 - Analisar o animal");
                    System.out.println("2 - Interagir com o animal");
                    System.out.println("3 - Alimentar o animal");
                    System.out.println("4 - Tratar o animal");
                    System.out.println("5 - Analisar a jaula");
                    System.out.println("6 - Limpar a jaula");
                    System.out.println("7 - Ir para a próxima jaula");
                    System.out.print("? ");
                    int escolha = sc.nextInt();

                    switch (escolha) {
                        case 1:
                            cuidador.analizarAnimal(jaula.getAnimal());
                            break;
                        case 2:
                            cuidador.interagir(jaula.getAnimal());
                            break;
                        case 3:
                            System.out.println("Escolha o alimento:");
                            for (Alimento a : Alimento.values()) {
                                System.out.print(a + " ");
                            }
                            System.out.println();
                            String input = sc.next().toUpperCase();
                            try {
                                Alimento alimento = Alimento.valueOf(input);
                                cuidador.alimentar(jaula.getAnimal(), alimento);
                            } catch (IllegalArgumentException e) {
                                System.out.println("Alimento inválido.");
                            } catch (AlimentoErradoException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 4:
                            try {
                                jaula.getAnimal().serTratado();
                            } catch (AnimalSaudavelException e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                            break;
                        case 5:
                            cuidador.analizarJaula(jaula);
                            break;
                        case 6:
                            jaula.limpar();
                            break;
                        case 7:
                            continuarJaula = false;
                            break;
                        default:
                            System.out.println("Escolha inválida!");
                            break;
                    }
                }
            }

            // Final do dia
            System.out.println("\nSeu turno acabou. Até amanha!!");
            RelatorioStatus.gerarRelatorio(jaulas, contador, nomeJogador);
            contador++;
            zoo.passarDia();
        }

        // Fim do jogo
        sc.close();
        nome.close();
        System.out.println("Sua semana de trabalho ja acabou! Passou voando!!");
        System.out.println("Todos os status foram salvos e guardados na pasta repositorio com seu nome! De uma olhada por lá!");
        System.out.println("Muito obrigado por jogar "+ nomeJogador + "!");
    }
}

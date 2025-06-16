import java.util.ArrayList;
import java.util.Random;

/**
 * Classe que representa o zoológico.
 * Contém uma lista de jaulas e controla os eventos que ocorrem diariamente
 * com os animais e suas jaulas, como aumento de fome, redução de felicidade,
 * chance de adoecer e sujeira da jaula.
 * 
 * @author Rafael e Luana
 * @version 1.0
 */
public class Zoologico {
    private ArrayList<Jaula> jaulas = new ArrayList<>();
    private Random random = new Random();

    /**
     * Construtor do zoológico.
     * Inicializa o zoológico com duas jaulas contendo um leão e um elefante.
     */
    public Zoologico() {
        jaulas.add(new Jaula(1, new Leao(), true));
        jaulas.add(new Jaula(2, new Elefante(), true));
    }

    /**
     * Retorna a lista de jaulas do zoológico.
     *
     * @return lista de jaulas.
     */
    public ArrayList<Jaula> getJaulas() {
        return jaulas;
    }

    /**
     * Simula a passagem de um dia no zoológico.
     * Para cada jaula:
     * - Existe 50% de chance da jaula ficar suja.
     * - A felicidade do animal diminui.
     * - A fome do animal aumenta.
     * - Há 30% de chance de o animal adoecer.
     */
    public void passarDia() {
        for (Jaula jaula : jaulas) {
            // Sujar jaula com 50% de chance
            if (random.nextBoolean()) {
                jaula.setStatus(false);
            }

            Animal animal = jaula.getAnimal();

            // Diminuir felicidade e aumentar fome
            animal.reduzirFelicidade(20);
            animal.aumentarFome(50);

            // Chance de adoecer
            if (random.nextInt(100) < 30) {
                animal.setSaude(false);
            }
        }
    }
}

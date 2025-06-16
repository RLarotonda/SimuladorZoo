import java.util.ArrayList;
import java.util.Random;

public class Zoologico {
    private ArrayList<Jaula> jaulas = new ArrayList<>();
    private Random random = new Random();

    public Zoologico() {
        jaulas.add(new Jaula(1, new Leao(), true));
        jaulas.add(new Jaula(2, new Elefante(), true));
    }

    public ArrayList<Jaula> getJaulas() {
        return jaulas;
    }

    public void passarDia() {
        for (Jaula jaula : jaulas) {
            // Sujar jaula com 50% de chance
            if (random.nextBoolean()) {
                jaula.setStatus(false);
            }

            Animal animal = jaula.getAnimal();

            // Diminuir felicidade e aumentar fome
            animal.reduzirFelicidade(20); // Dimuniu todos os dias 20
            animal.aumentarFome(50); // Aumenta a fome todos os dias

            // Chance de adoecer
            if (random.nextInt(100) < 30) { // 30% de chance
                animal.setSaude(false);
            }
        }
    }
}

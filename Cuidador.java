public class Cuidador implements Comandos{
    public void analizarJaula(Jaula jaula) {
        jaula.analisarJaula();
    }
    public void analizarAnimal(Animal animal) {
        System.out.println(animal.toString());
    }
    public void interagir(Animal animal) {
        animal.interagir();
        animal.aumentarFelicidade(30);
    }
    public void alimentar(Animal animal, Alimento alimento) {
        try {
            animal.alimentar(alimento);
            animal.diminuirFome(40);
        } catch (AlimentoErradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

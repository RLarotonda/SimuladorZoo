public class Cuidador implements Comandos{
    public void analizarJaula(Jaula jaula) {
        jaula.analisarJaula();
    }
    public void analizarAnimal(Animal animal) {
        System.out.println(animal.toString());
    }
    public void interagir(Animal animal) {
        animal.interagir();
    }
    public void alimentar(Animal animal, Alimento alimento) {
        try {
            animal.alimentar(alimento);
        } catch (AlimentoErradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

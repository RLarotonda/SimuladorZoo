public class Jaula {
    private int idJaula;
    private boolean status; //true = limpa false = suja
    private Animal animal; // Associacao

    public Jaula(int idJaula, Animal animal, boolean status) {
        this.animal = animal;
        this.status = status;
        this.idJaula = idJaula;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void limpar() {
        if (status) {
            System.out.println("A jaula ja estava limpa, mas agora está mais ainda!");
        } else {
            System.out.println("Agora a jaula esta limpa");
            status = true;
        }
    }

    public void analisarJaula() {
        if(status) {
            System.out.println("A jaula esta limpa");
        } else {
            System.out.println("A jaula esta suja");
        }
    }

    public String toString() {
        return "Jaula " + idJaula + " armazena o " + animal.getEspecie();
    }
}
public class Elefante extends Animal{
    private String especie = "Elefante";

    public Elefante() {
        super();
    }

    @Override
    public String getEspecie() {
        return especie;
    }

   public void interagir() {
    if (isSaude()) {
        System.out.println("O elefante o cumprimenta com a tromba");
        Animal.aumentarFelicidade(this, 50);
    } else {
        System.out.println("O elefante não tem força para interagir agora");
    }
}

    public void alimentar(Alimento alimento) {
        if(alimento == Alimento.VEGETAIS) {
            System.out.println("O elefante come os vegetais");
            diminuirFome(40);
        } else {
            throw new AlimentoErradoException("Elefantes não comem " + alimento.toString() + "! Sao vegetarianos");
        }
    }

    public void serTratado() {
        if (isSaude()) {
            throw new AnimalSaudavelException("O " + getEspecie() + " já está saudável!");
        } else {
            System.out.println("O esta esta curado agora!");
            setSaude(true);
        }
    }

    @Override
    public String toString() {
        return "Elefante\nFelicidade: " + getFelicidade() + "\nFome: " + getFome() + "\nSaúde: " + getStatusSaude();
    }

}

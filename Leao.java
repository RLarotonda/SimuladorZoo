public class Leao extends Animal{
    private String especie = "Leao";

    public Leao() {
        super();
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    public void interagir() {
        System.out.println("O leao ruge alto");
        aumentarFelicidade(50);
    }

    public void alimentar(Alimento alimento) throws AlimentoErradoException {
        if(alimento == Alimento.CARNE){
            System.out.println("O leao devora a carne");
            diminuirFome(40);
        } else {
            throw new AlimentoErradoException("Leões não comem " + alimento.toString() + "!");
        }
    }

    public void serTratado() {
        if (isSaude()) {
            throw new AnimalSaudavelException("O leao já está saudável!");
        } else {
            System.out.println("O esta esta curado agora!");
            setSaude(true);
        }
    }

    @Override
    public String toString() {
        return "Leão\nFelicidade: " + getFelicidade() + "\nFome: " + getFome() + "\nSaúde: " + getStatusSaude();
    }

}

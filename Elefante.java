/**
 * Classe que representa um Elefante no zoológico.
 * É uma subclasse de Animal que define comportamento específico para elefantes,
 * incluindo alimentação, interação e tratamento.
 * 
 * @author Rafael e Luana
 * @version 1.0
 */
public class Elefante extends Animal {
    private String especie = "Elefante";

    /**
     * Construtor padrão que inicializa um Elefante.
     */
    public Elefante() {
        super();
    }

    /**
     * Retorna a espécie do elefante.
     * 
     * @return String com o nome da espécie "Elefante"
     */
    @Override
    public String getEspecie() {
        return especie;
    }

    /**
     * Método para interação do elefante com o cuidador ou ambiente.
     * Se o elefante estiver saudável, cumprimenta com a tromba e aumenta felicidade.
     * Caso contrário, informa que não tem força para interagir.
     */
    public void interagir() {
        if (isSaude()) {
            System.out.println("O elefante o cumprimenta com a tromba");
            Animal.aumentarFelicidade(this, 50);
        } else {
            System.out.println("O elefante não tem força para interagir agora");
        }
    }

    /**
     * Alimenta o elefante com o alimento fornecido.
     * Elefantes são vegetarianos e só aceitam VEGETAIS.
     * 
     * @param alimento O tipo de alimento a ser oferecido
     * @throws AlimentoErradoException se o alimento não for VEGETAIS
     */
    public void alimentar(Alimento alimento) {
        if (alimento == Alimento.VEGETAIS) {
            System.out.println("O elefante come os vegetais");
            diminuirFome(40);
        } else {
            throw new AlimentoErradoException("Elefantes não comem " + alimento.toString() + "! São vegetarianos");
        }
    }

    /**
     * Trata o elefante. Se já estiver saudável, lança exceção.
     * Caso contrário, cura o elefante e altera o estado de saúde.
     * 
     * @throws AnimalSaudavelException se o elefante já estiver saudável
     */
    public void serTratado() {
        if (isSaude()) {
            throw new AnimalSaudavelException("O " + getEspecie() + " já está saudável!");
        } else {
            System.out.println("O está esta curado agora!");
            setSaude(true);
        }
    }

    /**
     * Retorna uma representação textual do elefante,
     * incluindo felicidade, fome e status de saúde.
     * 
     * @return String com informações do elefante
     */
    @Override
    public String toString() {
        return "Elefante\nFelicidade: " + getFelicidade() + "\nFome: " + getFome() + "\nSaúde: " + getStatusSaude();
    }
}

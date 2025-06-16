/**
 * Classe que representa um Leão no zoológico.
 * Subclasse de Animal que define comportamento específico para leões,
 * incluindo alimentação, interação e tratamento.
 * 
 * @author Rafael e Luana 
 * @version 1.0
 */
public class Leao extends Animal {
    private String especie = "Leao";

    /**
     * Construtor padrão que inicializa um Leão.
     */
    public Leao() {
        super();
    }

    /**
     * Retorna a espécie do leão.
     * 
     * @return String com o nome da espécie "Leao"
     */
    @Override
    public String getEspecie() {
        return especie;
    }

    /**
     * Método para interação do leão com o cuidador ou ambiente.
     * O leão ruge alto e aumenta sua felicidade.
     */
    public void interagir() {
        System.out.println("O leao ruge alto");
        aumentarFelicidade(50);
    }

    /**
     * Alimenta o leão com o alimento fornecido.
     * Leões são carnívoros e só aceitam CARNE.
     * 
     * @param alimento O tipo de alimento a ser oferecido
     * @throws AlimentoErradoException se o alimento não for CARNE
     */
    public void alimentar(Alimento alimento) throws AlimentoErradoException {
        if (alimento == Alimento.CARNE) {
            System.out.println("O leao devora a carne");
            diminuirFome(40);
        } else {
            throw new AlimentoErradoException("Leões não comem " + alimento.toString() + "!");
        }
    }

    /**
     * Trata o leão. Se já estiver saudável, lança exceção.
     * Caso contrário, cura o leão e altera o estado de saúde.
     * 
     * @throws AnimalSaudavelException se o leão já estiver saudável
     */
    public void serTratado() {
        if (isSaude()) {
            throw new AnimalSaudavelException("O leao já está saudável!");
        } else {
            System.out.println("O esta esta curado agora!");
            setSaude(true);
        }
    }

    /**
     * Retorna uma representação textual do leão,
     * incluindo felicidade, fome e status de saúde.
     * 
     * @return String com informações do leão
     */
    @Override
    public String toString() {
        return "Leão\nFelicidade: " + getFelicidade() + "\nFome: " + getFome() + "\nSaúde: " + getStatusSaude();
    }
}

/**
 * Classe que representa uma Jaula no zoológico.
 * Contém um identificador, status de limpeza e um animal associado.
 * 
 * @author Luana Cosmo
 * @version 1.0
 */
public class Jaula {
    /**
     * Identificador único da jaula.
     */
    private int idJaula;

    /**
     * Status da jaula: true para limpa, false para suja.
     */
    private boolean status;

    /**
     * Animal associado à jaula.
     */
    private Animal animal;

    /**
     * Construtor que inicializa uma jaula com ID, animal e status.
     * 
     * @param idJaula Identificador da jaula
     * @param animal Animal que ficará na jaula
     * @param status Estado inicial da jaula (true = limpa, false = suja)
     */
    public Jaula(int idJaula, Animal animal, boolean status) {
        this.animal = animal;
        this.status = status;
        this.idJaula = idJaula;
    }

    /**
     * Retorna o animal associado a esta jaula.
     * 
     * @return Animal dentro da jaula
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * Define o status da jaula.
     * 
     * @param status true para limpa, false para suja
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Limpa a jaula. Se já estiver limpa, informa que está ainda mais limpa.
     * Caso contrário, altera o status para limpa e avisa.
     */
    public void limpar() {
        if (status) {
            System.out.println("A jaula ja estava limpa, mas agora está mais ainda!");
        } else {
            System.out.println("Agora a jaula esta limpa");
            status = true;
        }
    }

    /**
     * Analisa e exibe o status da jaula (limpa ou suja).
     */
    public void analisarJaula() {
        if (status) {
            System.out.println("A jaula esta limpa");
        } else {
            System.out.println("A jaula esta suja");
        }
    }

    /**
     * Retorna uma descrição da jaula, incluindo seu ID e o animal que abriga.
     * 
     * @return String com informações da jaula
     */
    @Override
    public String toString() {
        return "Jaula " + idJaula + " armazena o " + animal.getEspecie();
    }
}

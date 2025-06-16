/**
 * Representa um cuidador responsável por executar ações em animais e jaulas.
 * Implementa os comandos definidos na interface {@code Comandos}.
 * Pode analisar jaulas e animais, interagir, e alimentar animais.
 * 
 * @author Rafael e Luana
 * @version 1.0
 */
public class Cuidador implements Comandos {

    /**
     * Analisa o estado da jaula informada.
     * 
     * @param jaula A jaula a ser analisada.
     */
    public void analizarJaula(Jaula jaula) {
        jaula.analisarJaula();
    }

    /**
     * Exibe as informações do animal no console.
     * 
     * @param animal O animal a ser analisado.
     */
    public void analizarAnimal(Animal animal) {
        System.out.println(animal.toString());
    }

    /**
     * Realiza a interação com o animal.
     * 
     * @param animal O animal a ser estimulado.
     */
    public void interagir(Animal animal) {
        animal.interagir();
    }

    /**
     * Alimenta o animal com o alimento informado.
     * Caso o alimento não seja adequado, trata a exceção.
     * 
     * @param animal O animal a ser alimentado.
     * @param alimento O alimento fornecido.
     */
    public void alimentar(Animal animal, Alimento alimento) {
        try {
            animal.alimentar(alimento);
        } catch (AlimentoErradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

/**
 * Exceção lançada quando um animal recebe um tipo de alimento que não é apropriado para sua dieta.
 * Essa exceção é usada para indicar que a ação de alimentar o animal foi inválida.
 */
public class AlimentoErradoException extends RuntimeException {

    /**
     * Construtor que recebe uma mensagem de erro.
     *
     * @param message A mensagem explicando o motivo da exceção.
     */
    public AlimentoErradoException(String message) {
        super(message);
    }
}

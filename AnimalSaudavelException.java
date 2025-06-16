/**
 * Exceção lançada quando se tenta tratar um animal que já está saudável.
 * Essa exceção serve para impedir tratamentos desnecessários e alertar o cuidador.
 */
public class AnimalSaudavelException extends RuntimeException {

    /**
     * Construtor que recebe uma mensagem de erro.
     *
     * @param message A mensagem explicando o motivo da exceção.
     */
    public AnimalSaudavelException(String message) {
        super(message);
    }
}


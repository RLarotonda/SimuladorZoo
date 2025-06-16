/**
 * Enum que representa os tipos de alimentos disponíveis no zoológico.
 * Cada animal aceita apenas certos tipos de alimento. 
 
 */
public enum Alimento {
    CARNE, VEGETAIS, PEIXE;

    /**
     * Retorna o nome do alimento em letras maiúsculas.
     *
     * @return nome do alimento como {@code String}.
     */
    @Override
    public String toString() {
        return name();
    }
}

/**
 * Representa um animal genérico no zoológico.
 * Possui atributos de saúde, fome e felicidade.
 * Deve ser estendida por classes específicas.
 *
 * @author Rafael e Luana
 * @version 1.0
 */
public abstract class Animal {
    private boolean saude; // true = saudável, false = doente
    private int felicidade; // 0 a 100
    private int fome; // 0 a 100

    /** Inicializa o animal com felicidade e fome em 50, e saudável. */
    public Animal() {
        this.felicidade = 50;
        this.fome = 50;
        this.saude = true;
    }

    /** @return Nível de felicidade (0-100). */
    public int getFelicidade() {
        return felicidade;
    }

    /** @param felicidade Novo valor de felicidade (0-100). */
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    /** @return Nível de fome (0-100). */
    public int getFome() {
        return fome;
    }

    /** @param fome Novo valor de fome (0-100). */
    public void setFome(int fome) {
        this.fome = fome;
    }

    /** @return true se saudável, false se doente. */
    public boolean isSaude() {
        return saude;
    }

    /** @return "saudável" ou "doente". */
    public String getStatusSaude() {
        return saude ? "saudável" : "doente";
    }

    /** @param saude true para saudável, false para doente. */
    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    /** Aumenta a felicidade, no máximo até 100. */
    public void aumentarFelicidade(int valor) {
        felicidade = Math.min(100,felicidade + valor);
    }

    /** Reduz a felicidade, no mínimo até 0. */
    public void reduzirFelicidade(int valor) {
        felicidade = Math.max(0, felicidade - valor);
    }

    /** Reduz a fome, no mínimo até 0. */
    public void diminuirFome(int valor) {
        fome = Math.max(0, fome - valor);
    }

    /** Aumenta a fome, no máximo até 100. */
    public void aumentarFome(int valor) {
        fome = Math.min(100, fome + valor);
    }

    /** @return Nome da espécie. */
    public abstract String getEspecie();

    /** Define a interação do animal com visitantes. */
    public abstract void interagir();

    /** Alimenta o animal com determinado alimento.
     * @throws AlimentoErradoException Se o alimento não for aceito. */
    public abstract void alimentar(Alimento alimento) throws AlimentoErradoException;

    /** Trata o animal se estiver doente. */
    public abstract void serTratado();

    /** @return Descrição completa do animal. */
    public abstract String toString();
}

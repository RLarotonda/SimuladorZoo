import java.lang.String;

public abstract class Animal {
    private boolean saude; // true = saudavel false = doente
    private int felicidade; // 0 a 100%
    private int fome; // 0 a 100%

    public Animal() {
        this.felicidade = 50;
        this.fome = 50;
        this.saude = true;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public boolean isSaude() {
        return saude;
    }

    public String getStatusSaude() {
        return saude ? "saudável" : "doente";
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    public void aumentarFelicidade(int valor) {
        felicidade = Math.min(100, felicidade + valor);
    }

    public void reduzirFelicidade(int valor) {
        felicidade = Math.max(0, felicidade - valor); // Metodo padrao Java, limita para no minimo 0
    }

    public void diminuirFome(int valor) {
        fome = Math.max(0, fome - valor);
    }

    public void aumentarFome(int valor) {
        fome = Math.min(100, fome + valor); // Metodo padrao Java, limita para o maximo 100
    }

    public abstract String getEspecie();
    public abstract void interagir();
    public abstract void alimentar(Alimento alimento) throws AlimentoErradoException;
    public abstract void serTratado();
    public abstract String toString();
}
/**
 * Interface que define os comandos que um cuidador pode realizar
 * em relação aos animais e às jaulas do zoológico.
 * 
 * Os métodos desta interface devem ser implementados por classes que
 * representam cuidadores ou entidades responsáveis pela interação com os animais.
 */
public interface Comandos {

    /**
     * Analisa a jaula fornecida, verificando seu estado de limpeza.
     *
     * @param jaula A jaula a ser analisada.
     */
    public void analizarJaula(Jaula jaula);

    /**
     * Analisa o estado atual do animal, como saúde, fome e felicidade.
     *
     * @param animal O animal a ser analisado.
     */
    public void analizarAnimal(Animal animal);

    /**
     * Realiza uma interação com o animal, podendo afetar sua felicidade.
     *
     * @param animal O animal com o qual se deseja interagir.
     */
    public void interagir(Animal animal);

    /**
     * Alimenta o animal com o tipo de alimento especificado.
     *
     * @param animal O animal a ser alimentado.
     * @param alimento O alimento a ser oferecido.
     */
    public void alimentar(Animal animal, Alimento alimento);
}

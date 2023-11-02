package biblioteca.models.acervo.salas;

public class SalaIndiviual extends Sala{
    private boolean computadorDisponivel;

    public SalaIndiviual() {
        super();

        this.computadorDisponivel = false;
    }

    //GETTERS N SETTERS
    public boolean isComputadorDisponivel() {
        return computadorDisponivel;
    }

    public void setComputadorDisponivel(boolean computadorDisponivel) {
        this.computadorDisponivel = computadorDisponivel;
    }

}

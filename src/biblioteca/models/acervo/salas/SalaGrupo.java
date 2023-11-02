package biblioteca.models.acervo.salas;

public class SalaGrupo extends Sala{
    private int capMax;
    private boolean equipApresentacao;

    public SalaGrupo() {
        super();

        this.capMax = 0;
        this.equipApresentacao = false;
    }

    //GETTERS N SETTERS
    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public boolean isEquipApresentacao() {
        return equipApresentacao;
    }

    public void setEquipApresentacao(boolean equipApresentacao) {
        this.equipApresentacao = equipApresentacao;
    }

}

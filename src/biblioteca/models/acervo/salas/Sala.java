package biblioteca.models.acervo.salas;

import biblioteca.models.acervo.Acervo;

public abstract class Sala implements Acervo{
    private boolean reservado;
    private Integer numeroSala;

    public Sala () {
        this.reservado = false;
        this.numeroSala = null;
    }

    //GETTERS N SETTERS
    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    @Override
    public Integer getId(){
        return numeroSala;
    }

}

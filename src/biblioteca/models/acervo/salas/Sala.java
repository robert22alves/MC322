package biblioteca.models.acervo.salas;

import biblioteca.models.acervo.Acervo;

public abstract class Sala implements Acervo{
    private boolean reservado;
    private String numeroSala;

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

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

}

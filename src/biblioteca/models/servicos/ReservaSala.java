package biblioteca.models.servicos;

import biblioteca.models.Data;
import biblioteca.models.Horario;
import biblioteca.models.acervo.salas.Sala;

public class ReservaSala {
    private Sala sala;
    private Data dataReserva;
    private Horario horaInicio;
    private Horario horaFim;

    private StatusReserva status;

    public ReservaSala(Sala sala, StatusReserva status) {
        this.sala = sala;
        this.dataReserva = null;
        this.horaFim = null;
        this.horaInicio = null;
        this.status = status;
    }

    public Sala getSala() {
        return sala;
    }

    public Data getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Data dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Horario getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Horario horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Horario getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Horario horaFim) {
        this.horaFim = horaFim;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    
}

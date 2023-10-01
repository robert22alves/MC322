package biblioteca.models.eventos;

import biblioteca.models.Data;
import biblioteca.models.Horario;

public class Palestra {
    private String palestrante;
    private String topico;
    private Data data;
    private Horario horario;
    private String local;

    public Palestra() {
        this.palestrante = null;
        this.topico = null;
        this.data = null;
        this.horario = null;
        this.local = null;
    }

    //GETTERS N SETTERS
    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}

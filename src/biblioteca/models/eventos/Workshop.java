package biblioteca.models.eventos;

import java.util.ArrayList;

import biblioteca.models.Data;
import biblioteca.models.Horario;

public class Workshop {
    private String instrutor;
    private String topico;
    private ArrayList<String> materiaisNecessarios;
    private Data data;
    private Horario horario;
    private String local;

    public Workshop() {
        this.instrutor = null;
        this.topico = null;
        this.materiaisNecessarios = new ArrayList<>();
        this.data = null;
        this.horario = null;
        this.local = null;
    }

    public void addMaterial(String material) {
        materiaisNecessarios.add(material);
    }

    //GETTERS N SETTERS
    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public ArrayList<String> getMateriaisNecessarios() {
        return materiaisNecessarios;
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

package biblioteca.models.eventos;

import java.util.ArrayList;

import biblioteca.models.Horario;

public class Exposicao {
    private String tema;
    private ArrayList<String> expositores;
    private Horario duracao;
    private String local;

    public Exposicao() {
        this.tema = null;
        this.expositores = new ArrayList<>();
        this.duracao = null;
        this.local = null;
    }

    public void addExpositor(String expositor) {
        expositores.add(expositor);
    }

    //GETTERS N SETTERS
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<String> getExpositores() {
        return expositores;
    }

    public Horario getDuracao() {
        return duracao;
    }

    public void setDuracao(Horario duracao) {
        this.duracao = duracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}

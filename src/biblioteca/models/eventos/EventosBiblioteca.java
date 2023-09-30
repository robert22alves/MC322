package biblioteca.models.eventos;

import java.util.ArrayList;

import biblioteca.models.membros.Membro;

public class EventosBiblioteca {
    private ArrayList<Membro> participantes;

    enum TipoDeEvento {
        PALESTRA, WORKSHOP, EXPOSICAO;
    }

    private TipoDeEvento tipo;

    public EventosBiblioteca(TipoDeEvento tipo) {
        this.participantes = new ArrayList<>();
        this.tipo = tipo;
    }

    public void addParticipante(Membro participante) {
        participantes.add(participante);
    }

    public ArrayList<Membro> getParticipantes() {
        return participantes;
    }

    public TipoDeEvento getTipo() {
        return tipo;
    }
}

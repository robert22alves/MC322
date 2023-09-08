package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.Horario;

public class EventosBiblioteca {
    private class Palestra {
        private String palestrante;
        private String tópico;
        private Data data;
        private Horario horário;
        private String local;
    }

    private class Workshop {
        private String instrutor;
        private String tópico;
        private String[] materiaisNecessarios;
        private Data data;
        private Horario horário;
        private String local;
    }

    private class Exposicao {
        private String tema;
        private String[] expositores;
        private Horario duracao;
        private String local;
    }

    enum TipoDeEvento {
        PALESTRA, WORKSHOP, EXPOSICAO;
    }

    private TipoDeEvento tipo;
}

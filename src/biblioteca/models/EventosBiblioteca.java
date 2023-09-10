package biblioteca.models;

public class EventosBiblioteca {
    private class Palestra extends EventosBiblioteca{
        private String palestrante;
        private String topico;
        private Data data;
        private Horario horario;
        private String local;

        public Palestra(String palestrante, String topico, Data data, Horario horario, String local) {
            this.data = data;
            this.topico = topico;
            this.horario = horario;
            this.palestrante = palestrante;
            this.local = local;
        }

        public String getPalestrante() {
            return palestrante;
        }

        public String getTopico() {
            return topico;
        }

        public Data getData() {
            return data;
        }

        public Horario getHorario() {
            return horario;
        }

        public String getLocal() {
            return local;
        }
    }

    private class Workshop extends EventosBiblioteca{
        private String instrutor;
        private String topico;
        private String[] materiaisNecessarios;
        private Data data;
        private Horario horario;
        private String local;

        public Workshop(String instrutor, String topico, Data data, Horario horario, String local, String[] materiaisNecessarios) {
            this.data = data;
            this.topico = topico;
            this.horario = horario;
            this.instrutor = instrutor;
            this.local = local;
            this.materiaisNecessarios = materiaisNecessarios;
        }

        public String getInstrutor() {
            return instrutor;
        }

        public String getTopico() {
            return topico;
        }

        public String[] getMateriaisNecessarios() {
            return materiaisNecessarios;
        }

        public Data getData() {
            return data;
        }

        public Horario getHorario() {
            return horario;
        }

        public String getLocal() {
            return local;
        }
    }

    private class Exposicao extends EventosBiblioteca{
        private String tema;
        private String[] expositores;
        private Horario duracao;
        private String local;

        public Exposicao(String tema, String[] expositores, Horario duracao, String local) {
            this.tema = tema;
            this.duracao = duracao;
            this.expositores = expositores;
            this.local = local;
        }

        public String getTema() {
            return tema;
        }

        public String[] getExpositores() {
            return expositores;
        }

        public Horario getDuracao() {
            return duracao;
        }

        public String getLocal() {
            return local;
        }
    }

    enum TipoDeEvento {
        PALESTRA, WORKSHOP, EXPOSICAO;
    }

    private TipoDeEvento tipo;

    public TipoDeEvento getTipo() {
        return tipo;
    }
}

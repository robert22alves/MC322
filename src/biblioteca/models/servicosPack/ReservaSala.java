package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.Horario;
import biblioteca.models.Reservaveis;

import java.util.ArrayList;

public class ReservaSala implements Reservaveis{
    private Data dataReserva;
    private Horario horaInicio;
    private Horario horaFim;

    private class SalaIndiviual {
        private boolean computadorDisponivel;
        private String numeroSala;

        public SalaIndiviual(String numeroSala, boolean computadorDisponivel) {
            this.computadorDisponivel = computadorDisponivel;
            this.numeroSala = numeroSala;
        }

        public boolean isComputadorDisponivel() {
            return computadorDisponivel;
        }

        public String getNumeroSala() {
            return numeroSala;
        }
    }

    private class SalaGrupo {
        private int capMax;
        private boolean equipApresentacao;

        public SalaGrupo(int capMax, boolean equipApresentacao) {
            this.capMax = capMax;
            this.equipApresentacao = equipApresentacao;
        }

        public int getCapMax() {
            return capMax;
        }

        public boolean isEquipApresentacao() {
            return equipApresentacao;
        }
    }

    private class SalaSilenciosa {
        private int assentos;
        private boolean cabinesIndividuais;

        public SalaSilenciosa(int assentos, boolean cabinesIndividuais) {
            this.assentos = assentos;
            this.cabinesIndividuais = cabinesIndividuais;
        }

        public int getAssentos() {
            return assentos;
        }

        public boolean isCabinesIndividuais() {
            return cabinesIndividuais;
        }
    }

    private class SalaMultimidia {
        private ArrayList<String> equipamentos;

        public SalaMultimidia(ArrayList<String> equipamentos) {
            this.equipamentos = equipamentos;
        }

        public ArrayList<String> getEquipamentos() {
            return equipamentos;
        }
    }

    enum StatusReserva{
        PENDENTE,
        CONFIRMADA,
        CANCELADA
    }

    private StatusReserva status;

    public Data getDataReserva() {
        return dataReserva;
    }

    public Horario getHoraInicio() {
        return horaInicio;
    }

    public Horario getHoraFim() {
        return horaFim;
    }

    public StatusReserva getStatus() {
        return status;
    }
}

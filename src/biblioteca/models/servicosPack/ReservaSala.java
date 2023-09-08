package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.Horario;

public class ReservaSala {
    private Data dataReserva;
    private Horario horaInicio;
    private Horario horaFim;

    private class SalaIndiviual {
        boolean computadorDisponivel;
        String numeroSala;
    }

    private class SalaGrupo {
        int capMax;
        boolean equipApresentacao;
    }

    private class SalaSilenciosa {
        int assentos;
        boolean cabinesIndividuais;
    }

    private class SalaMultimidia {
        String[] equipamentos;
    }

    enum StatusReserva{
        PENDENTE,
        CONFIRMADA,
        CANCELADA
    }

    private StatusReserva status;
}

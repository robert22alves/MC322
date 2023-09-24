package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.Reservaveis;
import biblioteca.models.itensPack.ItemAbs;
import biblioteca.models.membrosPack.MembroAbs;

public class Reserva{
    private Data dia;
    private MembroAbs membro;
    private Reservaveis item;
    private static int num_reservas = 0; //numero de reservas
    private static ListaReservas<Reservaveis> listaReservas = new ListaReservas<>();

    public Reserva(Data dia, MembroAbs membro, Reservaveis item) {
        Reserva.num_reservas += 1;
        this.dia = dia;
        this.membro = membro;
        this.item = item;

        listaReservas.adicionarReserva(item, membro);
    }

    //Getters

    public Data getDia() {
        return dia;
    }

    public MembroAbs getMembro() {
        return membro;
    }

    public Reservaveis getItem() {
        return item;
    }

    public static int getNum_reservas() {
        return num_reservas;
    }

}

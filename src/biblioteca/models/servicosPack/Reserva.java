package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.itensPack.ItemAbs;
import biblioteca.models.membrosPack.MembroAbs;

public class Reserva{
    private Data dia;
    private MembroAbs membro;
    private ItemAbs item;
    private static int num_reservas = 0; //numero de reservas

    public Reserva(Data dia, MembroAbs membro, ItemAbs item, int num_reservas) {
        Reserva.num_reservas += 1;
        this.dia = dia;
        this.membro = membro;
        this.item = item;

        ListaReservas.adicionarReserva(item, membro);
    }

    //Getters

    public Data getDia() {
        return dia;
    }

    public MembroAbs getMembro() {
        return membro;
    }

    public ItemAbs getItem() {
        return item;
    }

    public static int getNum_reservas() {
        return num_reservas;
    }

}

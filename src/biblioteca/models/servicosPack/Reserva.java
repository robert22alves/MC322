package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.itensPack.ItemAbs;
import biblioteca.models.membrosPack.MembroAbs;

public class Reserva {
    private Data dia;
    private MembroAbs membro;
    private ItemAbs item;

    public Reserva(Data dia, MembroAbs membro, ItemAbs item) {
        this.dia = dia;
        this.membro = membro;
        this.item = item;
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

}

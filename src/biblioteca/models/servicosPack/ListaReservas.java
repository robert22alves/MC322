package biblioteca.models.servicosPack;

import java.util.ArrayList;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.Reservaveis;

public class ListaReservas<T extends Reservaveis> {

    private ArrayList<String> lista_reservas;

    public ListaReservas() {
        this.lista_reservas = new ArrayList<>();
    }

    //Getter
    public ArrayList<String> getLista_reservas() {
        return lista_reservas;
    }

    //Metodo
    public void adicionarReserva(T item, MembroAbs membro){
        lista_reservas.add(membro + "reservou o item" + item);
        return;
    }

}

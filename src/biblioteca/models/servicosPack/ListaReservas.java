package biblioteca.models.servicosPack;

import java.util.List;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.itensPack.ItemAbs;

public abstract class ListaReservas<T> {

    private static List<String> lista_reservas;

    //Getter
    public List<String> getLista_reservas() {
        return lista_reservas;
    }

    //Metodo
    public static void adicionarReserva(ItemAbs item, MembroAbs membro){
        lista_reservas.add(membro + "reservou o item" + item);
        return;
    }

}

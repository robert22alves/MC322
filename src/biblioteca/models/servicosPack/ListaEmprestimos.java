package biblioteca.models.servicosPack;

import java.util.List;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.itensPack.ItemAbs;

public abstract class ListaEmprestimos<T>{
 
    private static List<String> lista_emprestimos;


    //Getter
    public List<String> getLista_emprestimos() {
        return lista_emprestimos;
    }

    //Metodo
    public static void adicionarEmprestimo(ItemAbs item, MembroAbs membro){
        lista_emprestimos.add(membro + "fez emprestimo do item" + item);
        return;
    }
}

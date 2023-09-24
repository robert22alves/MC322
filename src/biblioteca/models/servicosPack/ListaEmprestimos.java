package biblioteca.models.servicosPack;

import java.util.ArrayList;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.Reservaveis;

public class ListaEmprestimos<T extends Reservaveis>{
 
    private ArrayList<String> lista_emprestimos;

    public ListaEmprestimos() {
        this.lista_emprestimos = new ArrayList<>(); 
    }

    //Getter
    public ArrayList<String> getLista_emprestimos() {
        return lista_emprestimos;
    }

    //Metodo
    public void adicionarEmprestimo(T item, MembroAbs membro){
        lista_emprestimos.add(membro + "fez emprestimo do item" + item);
        return;
    }
}

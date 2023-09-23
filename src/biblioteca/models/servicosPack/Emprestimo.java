package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.itensPack.ItemAbs;

public class Emprestimo{
    private Data dia;
    private MembroAbs membro;
    private ItemAbs item;
    private Data prazoEmprestimo;
    private static int num_emprestimos = 0; //numero de emprestimos

    public Emprestimo(Data dia, MembroAbs membro, ItemAbs item, int num_emprestimos) {
        Emprestimo.num_emprestimos += 1;
        this.dia = dia;
        this.membro = membro;
        this.item = item;
        this.prazoEmprestimo = Data.newData(dia, membro.getPrazoEmprestimo());

        ListaEmprestimos.adicionarEmprestimo(item, membro);
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

    public Data getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public static int getNum_emprestimos() {
        return num_emprestimos;
    }

}

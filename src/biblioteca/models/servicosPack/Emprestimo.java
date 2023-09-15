package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.itensPack.ItemAbs;

public class Emprestimo {
    private Data dia;
    private MembroAbs membro;
    private ItemAbs item;
    private Data prazoEmprestimo;

    public Emprestimo(Data dia, MembroAbs membro, ItemAbs item) {
        this.dia = dia;
        this.membro = membro;
        this.item = item;
        this.prazoEmprestimo = Data.newData(dia, membro.getPrazoEmprestimo());
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
    
}

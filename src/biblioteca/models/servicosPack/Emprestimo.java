package biblioteca.models.servicosPack;

import biblioteca.models.Data;
import biblioteca.models.Reservaveis;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.itensPack.ItemAbs;
import biblioteca.models.exceptionPack.ExcecaoItemNaoDisponivel;
import biblioteca.models.exceptionPack.ExcecaoItemNaoEmprestado;
import biblioteca.models.exceptionPack.ExcecaoMultaPendente;


public class Emprestimo{
    private Data dia;
    private MembroAbs membro;
    private Reservaveis item;
    private Data prazoEmprestimo;
    private static int num_emprestimos = 0; //numero de emprestimos
    private static ListaEmprestimos<Reservaveis> listaEmprestimos = new ListaEmprestimos<>();

    public Emprestimo(Data dia, MembroAbs membro, Reservaveis item) {
        this.membro = membro;
        this.item = item;
        if(membro.getLimiteEmprestimo() == membro.getHistorico().length){
            throw new ExcecaoLimiteEmprestimoExcedido("Limite de emprestimos atingido");
        }
        else if(membro.getMultaAtraso()){
            throw new ExcecaoMultaPendente("Multas em aberto");
        }

    else{
        this.dia = dia;
        this.prazoEmprestimo = Data.newData(dia, membro.getPrazoEmprestimo());

        listaEmprestimos.adicionarEmprestimo(item, membro);
    }
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

    public Data getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public static int getNum_emprestimos() {
        return num_emprestimos;
    }

}

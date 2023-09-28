package biblioteca.models.itensPack;

import biblioteca.models.Data;
import biblioteca.models.Reservaveis;
import biblioteca.models.membrosPack.MembroAbs;
import biblioteca.models.servicosPack.Emprestimo;
import biblioteca.models.servicosPack.Reserva;
import java.util.List;
import java.util.ArrayList;

public class ItemBiblioteca<T extends ItemMultimidia> {
    private List<Emprestimo> itensEmprestados;
    private List<Reserva> itensReservados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;

    public ItemBiblioteca() {
        this.itensEmprestados = new ArrayList<Emprestimo>();
        this.itensReservados = new ArrayList<Reserva>();
        this.numeroDeItensEmprestados = Emprestimo.getNum_emprestimos();
        this.numeroDeItensReservados = Reserva.getNum_reservas();
    }
    //METODOS
    public void reservar(Data dia, MembroAbs membro, T item){
        new Reserva(dia, membro, item);
        return;
    }

    public void emprestar(Data dia, MembroAbs membro, T item){
        new Emprestimo(dia, membro, item);
        return;
    }

    public void devolver(){
    }

    //GETTERS 

    public List<Emprestimo> getItensEmprestados() {
        return itensEmprestados;
    }

    public List<Reserva> getItensReservados() {
        return itensReservados;
    }

    public int getNumeroDeItensEmprestados() {
        return numeroDeItensEmprestados;
    }

    public int getNumeroDeItensReservados() {
        return numeroDeItensReservados;
    }
        
}

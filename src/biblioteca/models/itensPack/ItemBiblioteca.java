package biblioteca.models.itensPack;

import biblioteca.models.servicosPack.Emprestimo;
import biblioteca.models.servicosPack.Reserva;
import java.util.List;
import java.util.ArrayList;

public class ItemBiblioteca<T> {
    private List<Emprestimo> itensEmprestados;
    private List<Reserva> itensReservados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;

    public ItemBiblioteca(List<Emprestimo> itensEmprestados, List<Reserva> itensReservados, int numeroDeItensEmprestados, int numeroDeItensReservados) {
        
        this.itensEmprestados = new ArrayList<Emprestimo>();
        this.itensReservados = new ArrayList<Reserva>();
        this.numeroDeItensEmprestados = Emprestimo.getNum_emprestimos();
        this.numeroDeItensReservados = Reserva.getNum_reservas();
    }
    //METODOS
    public void reservar(){
        new Reserva(null, null, null, numeroDeItensReservados+1);
        return;
    }

    public void emprestar(){
        new Emprestimo(null, null, null, numeroDeItensEmprestados+1);
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

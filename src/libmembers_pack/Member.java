package libmembers_pack;
import java.util.ArrayList;

import libservices_pack.Lending;
import libservices_pack.Renewal;
import libservices_pack.Reserve;
import miscellaneous.Person;

public abstract class Member extends Person{
    private int id;
    /*
     * Aluno -> RA
     * Funcinario e Professor -> Registro de Matricula
     */
    private int activity;
    /*
     * 0 -> Nenhuma
     * 1 -> Emprestimo
     * 2 -> Suspenso
     */
    private int total; //Total de Emprestimos Possiveis
    private int borMade; //Emprestimos Feitos
    private int borDays; //Tempo de Emprestimo em dias
    private float fineOd; // Multa por dia de atraso
    private float fine; //Multa a pagar

    //Historico
    private ArrayList<Lending> borrowing; //Emprestimos atuais
    private ArrayList<Lending> history; //Historico de Emprestimos
    private ArrayList<Renewal> renewal; //Pedido de Renovacao
    private ArrayList<Reserve> reserve; //Pedido de Reserva
    
    public Member(String firstname, String surname, int cpf, int id, int total, int borDays, float fine) {
        super(firstname, surname, cpf);
        this.id = id;
        this.activity = 0;
        this.total = total;
        this.borMade = 0;
        this.borDays = borDays;
        this.fine = 0;
        this.fineOd = fine;

        this.borrowing = new ArrayList<>();
        this.history = new ArrayList<>();
        this.renewal = new ArrayList<>();
        this.reserve = new ArrayList<>();
    }

    public void printActivity() {
        switch (activity) {
            case 0:
                System.out.println("Nenhuma Atividade");
                break;
            case 1:
                System.out.println("Fez " + borMade + " Empréstimos");
                break;
            case 2:
                System.out.println("Suspenso");
                break;
        }
    }
    public boolean canBorrowing() {        
        return !(borMade == total || activity == 2);
    }

    public void addItem(Lending l) {        
        borrowing.add(l);
    }

    public void returnItem(Lending l) {
        borrowing.remove(l);
        history.add(l);

        if (l.isOverdue()){
            fine += l.getFine() * l.getOverdueDays();

            if (l.getOverdueDays() >= 7)
                activity = 2;
        }
    }

    public void payFine() {
        fine = 0;
    }

    //Getters
    public int getId() {
        return id;
    }

    public int getTotal() {
        return total;
    }

    public int getBorMade() {
        return borMade;
    }

    public int getBorDays() {
        return borDays;
    }

    public float getFineOd() {
        return fineOd;
    }

    public int getActivity() {
        return activity;
    }

    public float getFine() {
        return fine;
    }

    public ArrayList<Lending> getBorrowing() {
        return borrowing;
    }

    public ArrayList<Lending> getHistory() {
        return history;
    }

    public ArrayList<Renewal> getRenewal() {
        return renewal;
    }

    public ArrayList<Reserve> getReserve() {
        return reserve;
    }
}

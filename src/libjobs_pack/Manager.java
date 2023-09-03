package libjobs_pack;

import system.Collection;
import system.Membership;

public class Manager extends Librarian{
    public Manager(String firstname, String surname, int cpf, int id, Collection itens, Membership membership) {
        super(firstname, surname, cpf, id, itens, membership);
    }
}

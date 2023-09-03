package libjobs_pack;

import system.Collection;
import system.Membership;

public class Administrator extends Manager{
    public Administrator(String firstname, String surname, int cpf, int id, Collection itens, Membership membership) {
        super(firstname, surname, cpf, id, itens, membership);
    }

    public void newMember() {
        //adicionar membro
    }
}

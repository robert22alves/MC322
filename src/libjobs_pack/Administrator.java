package libjobs_pack;

import system.Collection;
import system.Membership;

public class Administrator extends Manager{
    public Administrator(String firstname, String surname, int cpf, int id, Collection itens, Membership membership, String contact, String address, String registration_date) {
        super(firstname, surname, cpf, id, itens, membership, contact, address, registration_date);
    }

    public void newMember() {
        //adicionar membro
    }
}

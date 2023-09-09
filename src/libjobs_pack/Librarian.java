package libjobs_pack;

import libmembers_pack.Member;
import libmembers_pack.Staff;
import libservices_pack.Lending;
import libservices_pack.Service_Item;
import multimedia_pack.Item;
import system.Collection;
import system.Membership;

public class Librarian extends Staff{
    private Collection itens;
    private Membership membership;

    public Librarian(String firstname, String surname, int cpf, int id, Collection itens, Membership membership, String contact, String address, String registration_date) {
        super(firstname, surname, cpf, id, contact, address, registration_date);
        this.itens = itens;
        this.membership = membership;
    }

    private Member searchMember(int typeMember, String member) {
        Member m = null;
        switch (typeMember) {
            case 0:
                m = membership.returnGrad(member);
                break;
        
            case 1:
                m = membership.returnPgrad(member);
                break;
            
            case 2:
                m = membership.returnProfessor(member);
                break;
            
            case 3:
                m = membership.returnStaff(member);
                break;
        }
        return m;
    }

    private Item searchItem(int typeItem, String item) {
        Item i = null;
        switch (typeItem) {
            case 0:
                i = itens.returnBook(item);
                break;
        
            case 1:
                i = itens.returnEbook(item);
                break;
            
            case 2:
                i = itens.returnCD(item);
                break;
            
            case 3:
                i = itens.returnDVD(item);
                break;
        }
        return i;
    }

    public void makeLending(int typeItem, String item, int typeMember, String member, String lendDate, String returnDate) {         
        Item i = searchItem(typeItem, item);
        Member m = searchMember(typeMember, member);
        Service_Item.makeLending(i, m, lendDate, returnDate);
    }

    public void makeReturn(int typeMember, String member, Lending lending, String returnDate, boolean isOverdue ,int overdueDays) {         
        Member m = searchMember(typeMember, member);
        Service_Item.makeReturn(lending, m, returnDate, isOverdue, overdueDays);        
    }

    public void makeRenewal(Lending lending, String renewalDate, String returnDate) {         
        Service_Item.makeRenewal(lending, renewalDate, returnDate);
    }

    public void makeLen(int typeItem, String item, int typeMember, String member, String reserveDate) {         
        Item i = searchItem(typeItem, item);
        Member m = searchMember(typeMember, member);
        Service_Item.makeReserve(i, m, reserveDate);
    }

    public Collection getItens() {
        return itens;
    }

    public Membership getMembership() {
        return membership;
    }
}

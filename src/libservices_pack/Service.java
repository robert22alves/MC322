package libservices_pack;

import libmembers_pack.Member;
import multimedia_pack.Item;

public class Service {
    public static void makeLending(Item item, Member member, String lendDate, String returnDate) {
        if (item.canLending() && member.canBorrowing()){
            Lending l = new Lending(item, member, lendDate, returnDate);
            member.addItem(l);
            item.makeLending(l);
        }
    }

    public static void makeReturn(Lending lending, Member member, String returnDate, boolean isOverdue ,int overdueDays) {
        if (isOverdue){
            lending.setOverdue(isOverdue);
            lending.setOverdueDays(overdueDays);
        }

        member.returnItem(lending);
        lending.getItem().makeReturn();
    }
}

package libservices_pack;

import libmembers_pack.Member;
import multimedia_pack.Item;

public class Service_Item {
    public static void makeLending(Item item, Member member, String lendDate, String returnDate) {
        if (item.canLending() && member.canBorrowing()){
            Lending l = new Lending(item, member, lendDate, returnDate);
            member.addItem(l);
            item.makeLending(l);
        } 
        else {
            System.out.println(member + " não pode emprestar o item: " + item);
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

    public static void makeRenewal(Lending lending, String renewalDate, String returnDate) {
        if (!lending.getItem().isReserved() && !lending.isOverdue()){
            lending.getMember().addRenewal(new Renewal(lending, renewalDate, returnDate));
        }
        else {
            System.out.println(lending.getMember() + " não pode renovar o item: " + lending.getItem());
        }
    }

    public static void makeReserve(Item item, Member member, String reserveDate) {
        if (!item.isReserved()){
            member.addReserve(new Reserve(item, member, reserveDate));
            item.setReserved(true);
        } 
        else {
            System.out.println(member + " não pode reservar o item: " + item);
        }
    }
}

package libservices_pack;

import libjobs_pack.Librarian;
import libmembers_pack.Member;
import multimedia_pack.Item;

public class Renewal {
    private Item item;
    private Member member;
    private Librarian librarian;

    private String renewalDate;
    private String returnDate;
    private int lendDays;
    private boolean isOverdue;
    private int overdueDays; //Dias de atraso
    private float fine; //Multa por dia de atraso

    public Renewal(Item item, Member member, Librarian librarian, String renewalDate, String returnDate) {
        this.item = item;
        this.member = member;
        this.librarian = librarian;

        this.renewalDate = renewalDate;
        this.lendDays = member.getBorDays();
        this.returnDate = returnDate;
        this.isOverdue = false;
        this.overdueDays = 0;
        this.fine = item.getFine();
    }

    public Item getItem() {
        return item;
    }
    public Member getMember() {
        return member;
    }
    public Librarian getLibrarian() {
        return librarian;
    }
    public String getrenewalDate() {
        return renewalDate;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public int getLendDays() {
        return lendDays;
    }
    public boolean isOverdue() {
        return isOverdue;
    }
    public int getOverdueDays() {
        return overdueDays;
    }
    public float getFine() {
        return fine;
    }
}

package libservices_pack;

import libjobs_pack.Librarian;
import libmembers_pack.Member;
import multimedia_pack.Item;

public class Reserve {
    private Item item;
    private Member member;
    private Librarian librarian;

    private String reserveDate;
    private float fine; // multa por dia de atraso

    public Reserve(Item item, Member member, Librarian librarian, String reserveDate) {
        this.item = item;
        this.member = member;
        this.librarian = librarian;

        this.reserveDate = reserveDate;
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
    public String getReserveDate() {
        return reserveDate;
    }
    public float getFine() {
        return fine;
    }

}
package libservices_pack;

import libmembers_pack.Member;
import multimedia_pack.Item;

public class Lending {
    private Item item;
    private Member member;

    private String lendDate;
    private String returnDate;
    private int lendDays;
    private boolean isOverdue;
    private int overdueDays; //Dias de atraso
    private float fine; //Multa por dia de atraso
    
    public Lending(Item item, Member member, String lendDate, String returnDate) {
        this.item = item;
        this.member = member;

        this.lendDate = lendDate;
        this.lendDays = member.getBorDays();
        this.returnDate = returnDate;
        this.isOverdue = false;
        this.overdueDays = 0;
        this.fine = member.getFineOd();
    }
    
    public void makeRenewal(String new_returnDate){
        returnDate = new_returnDate;
    }

    public Item getItem() {
        return item;
    }
    public Member getMember() {
        return member;
    }
    public String getLendDate() {
        return lendDate;
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
    
    public void setOverdue(boolean isOverdue) {
        this.isOverdue = isOverdue;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public float getFine() {
        return fine;
    }    
}

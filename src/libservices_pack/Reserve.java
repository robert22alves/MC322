package libservices_pack;

import libmembers_pack.Member;
import multimedia_pack.Item;

public class Reserve {
    private Item item;
    private Member member;

    private String reserveDate;

    public Reserve(Item item, Member member, String reserveDate) {
        this.item = item;
        this.member = member;
        this.reserveDate = reserveDate;
    }

    public Item getItem() {
        return item;
    }
    public Member getMember() {
        return member;
    }
    public String getReserveDate() {
        return reserveDate;
    }
}
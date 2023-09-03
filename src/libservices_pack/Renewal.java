package libservices_pack;

public class Renewal {
    private Lending lending;
    private String renewalDate;

    public Renewal(Lending lending, String renewalDate, String returnDate) {
        this.lending = lending;
        lending.makeRenewal(returnDate);
        this.renewalDate = renewalDate;
    }

    public Lending getLending() {
        return lending;
    }

    public String getRenewalDate() {
        return renewalDate;
    }
}

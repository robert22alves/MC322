package multimedia_pack;

import libservices_pack.Lending;

public class P_Book extends Book{
    

    public P_Book(String title, String author, String publisher, String subject, int edition, float price, float fine) {
        super(title, author, publisher, subject, edition, price, fine);
    }

    public void addHistory(Lending l) {

    }

    public boolean checkLending() {
        return true;
    }
}

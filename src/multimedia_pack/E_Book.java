package multimedia_pack;

public class E_Book extends Book{
    public E_Book(String title, String author, String publisher, String subject, int edition) {
        super(title, author, publisher, subject, edition, 0, 0);
    }

    public boolean checkLending() {
        return true;
    }
}

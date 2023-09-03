package multimedia_pack;

public abstract class Book extends Item{
    private String subject;
    private int edition;
    private int isbn;

    public Book(String title, String gender, int isbn, String subject, String author_or_artist, String publisher, String synopsis, int edition, float price, float fine) {
        super(title, price, fine, author_or_artist, publisher, synopsis, gender);
        this.subject = subject;
        this.edition = edition;
        this.isbn = isbn;
    }

    //Getters
    public int getIsbn() {
        return isbn;
    }

    public String getSubject() {
        return subject;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public String toString() {
        return getTitle() + " " + edition;
    }
}

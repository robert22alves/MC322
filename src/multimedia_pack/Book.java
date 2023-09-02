package multimedia_pack;

public abstract class Book extends Item{
    private String author;
    private String publisher;
    private String subject;
    private int edition;

    public Book(String title, String author, String publisher, String subject, int edition, float price) {
        super(title, price);
        this.author = author;
        this.publisher = publisher;
        this.subject = subject;
        this.edition = edition;
    }

    //Getters
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
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

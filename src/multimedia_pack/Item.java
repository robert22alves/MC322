package multimedia_pack;

import libservices_pack.Lending;

public abstract class Item {
    private String title;
    private String author_or_artist;
    private String publisher;
    private String synopsis;
    private String gender;
    private float price;

    private Lending lending; //Emprestimo atual
    private boolean isAvailable = true;
    private boolean isReserved = false;


    public Item(String title, float price, float fine, String author_or_artist, String publisher, String synopsis, String gender) {
        this.author_or_artist = author_or_artist;
        this.publisher = publisher;
        this.synopsis = synopsis;
        this.gender = gender;
        this.title = title;
        this.price = price;
    }

    public boolean canLending() {
        return (isAvailable && !isReserved);
    }
    
    public void makeLending(Lending l) {
        lending = l;
        isAvailable = false;
    }

    public void makeReturn() {
        lending = null;
        isAvailable = true;
    }

    //Getters
    public String getPublisher() {
        return publisher;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public float getPrice() {
        return price;
    }

    public String getGender() {
        return gender;
    }
    public String getAuthor_or_artist() {
        return author_or_artist;
    }
    public float getFine() {
        return fine;
    }
    public String getTitle() {
        return title;
    }
    public Lending getLending() {
        return lending;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isReserved() {
        return isReserved;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}

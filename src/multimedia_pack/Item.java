package multimedia_pack;

import java.util.ArrayList;

import libservices_pack.Lending;

public abstract class Item {
    private String title;
    private String author_or_artist;
    private String publisher;
    private String synopsis;
    private String gender;
    private float price;
    private float fine;

    private ArrayList<Lending> lending; //Emprestimos atuais

    public Item(String title, float price, float fine, String author_or_artist, String publisher, String synopsis, String gender) {
        this.author_or_artist = author_or_artist;
        this.publisher = publisher;
        this.synopsis = synopsis;
        this.gender = gender;
        this.title = title;
        this.price = price;
        this.fine = fine;
    }

    public abstract boolean checkLending();
    
    public void addLending(Lending l) {
        getLending().add(l);
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
    public ArrayList<Lending> getLending() {
        return lending;
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

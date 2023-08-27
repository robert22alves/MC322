package multimedia_pack;

import java.util.ArrayList;

import libservices_pack.Lending;

public abstract class Item {
    private String title;

    private float price;
    private float fine;

    private ArrayList<Lending> lending; //Emprestimos atuais

    public Item(String title, float price, float fine) {
        this.title = title;
        this.price = price;
        this.fine = fine;
    }

    public abstract boolean checkLending();
    
    public void addLending(Lending l) {
        getLending().add(l);
    }

    //Getters
    public float getPrice() {
        return price;
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
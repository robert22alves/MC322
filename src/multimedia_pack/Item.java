package multimedia_pack;

import libservices_pack.Lending;

public abstract class Item {
    private String title;

    private float price;

    private Lending lending; //Emprestimo atual
    private boolean isAvailable = true;
    private boolean isReserved = false;

    public Item(String title, float price) {
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
    public float getPrice() {
        return price;
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

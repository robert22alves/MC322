package multimedia_pack;

public abstract class Media extends Item{

    private int minutes_duration;
    private int num_copies; //numero total de copias
    private int copies_available; //copias disponiveis
    private int preservation; // 1- pessimo; 2- ruim; 3- desgastado; 4- bom; 5- conservado

    public Media(String title, String author_or_artist, String publisher, String gender, String synopsis, float price, float fine, int minutes_duration, int num_copies, int copies_available, int preservation) {
        super(title, price, fine, author_or_artist, publisher, synopsis, gender);
        this.minutes_duration = minutes_duration;
        this.num_copies = num_copies;
        this.copies_available = copies_available;
        this.preservation = preservation;
    }

    // Getters
    public int getMinutes_duration() {
        return minutes_duration;
    }

    public int getNum_copies() {
        return num_copies;
    }

    public int getCopies_available() {
        return copies_available;
    }

    public int getPreservation() {
        return preservation;

    }
}



package multimedia_pack;

import libservices_pack.Lending;

public class P_Book extends Book{

    private int num_copies; //numero total de copias
    private int copies_available; //copias disponiveis
    private int preservation; // 1- pessimo; 2- ruim; 3- desgastado; 4- bom; 5- conservado
    

    public P_Book(String title, int num_copies, int copies_available, int preservation, String gender, int isbn, String author_or_artist, String synopsis, String author, String publisher, String subject, int edition, float price, float fine) {
        super(title, gender, isbn, subject, author_or_artist, publisher, synopsis, edition, price, fine);
        this.num_copies = num_copies;
        this.copies_available = copies_available;
        this.preservation = preservation;
    }

    public void addHistory(Lending l) {

    }

    public boolean checkLending() {
        return true;
    }
//Getters
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

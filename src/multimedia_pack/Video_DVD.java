package multimedia_pack;

import java.util.ArrayList;

public class Video_DVD extends Media{

    private ArrayList<String> casting; //elenco

        public Video_DVD(String title, ArrayList<String> casting, String author_or_artist, String publisher, String gender, String synopsis, float price, float fine, int minutes_duration, int num_copies, int copies_available, int preservation) {
        super(title, author_or_artist, publisher, gender, synopsis, price, fine, minutes_duration, num_copies, copies_available, preservation);
        this.casting = casting;
    }

    public boolean canLending() {
        return true;
    }

    //Getter
    public ArrayList<String> getCasting() {
        return casting;
    }

}

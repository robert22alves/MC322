package multimedia_pack;

import java.util.ArrayList;

public class Audio_CD  extends Media{

    private ArrayList<String> tracks;

    public Audio_CD(String title, ArrayList<String> tracks, String author_or_artist, String publisher, String gender, String synopsis, float price, float fine, int minutes_duration, int num_copies, int copies_available, int preservation) {
        super(title, author_or_artist, publisher, gender, synopsis, price, fine, minutes_duration, num_copies, copies_available, preservation);
        this.tracks = tracks;
    }

    public boolean checkLending() {
        return true;
    }

     //Getter
    public ArrayList<String> getTracks() {
        return tracks;
    }
}

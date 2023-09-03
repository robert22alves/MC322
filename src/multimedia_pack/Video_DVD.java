package multimedia_pack;

public class Video_DVD extends Media{
    public Video_DVD(String title, float price, float fine) {
        super(title, price, fine);
    }

    public boolean checkLending() {
        return true;
    }
}

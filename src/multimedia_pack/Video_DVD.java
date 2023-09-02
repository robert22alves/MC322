package multimedia_pack;

public class Video_DVD extends Media{
    public Video_DVD(String title, float price) {
        super(title, price);
    }

    public boolean canLending() {
        return true;
    }
}

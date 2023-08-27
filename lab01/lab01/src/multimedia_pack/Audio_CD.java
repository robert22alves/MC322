package multimedia_pack;

public class Audio_CD  extends Media{
    public Audio_CD(String title, float price, float fine) {
        super(title, price, fine);
    }

    public boolean checkLending() {
        return true;
    }
}

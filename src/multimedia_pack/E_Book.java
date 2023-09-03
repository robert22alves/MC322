package multimedia_pack;

public class E_Book extends Book{

    private String format; // (PDF, ePub, etc.)
    private int num_licences;
    private String file_format;
    private String url_access;
    private String reading_requirements;
    private String date_available;

    public E_Book(String title, int isbn, String subject, int edition, String author_or_artist, String publisher, String synopsis, String gender, float price, float fine, String format, int num_licences, String file_format, String url_access, String reading_requirements, String date_available) {
        super(title, gender, isbn, subject, author_or_artist, publisher, synopsis, edition, price, fine);
        this.format = format;
        this.num_licences = num_licences;
        this.file_format = file_format;
        this.url_access = url_access;
        this.reading_requirements = reading_requirements;
        this.date_available = date_available;
    }

    public boolean checkLending() {
        return true;
    }

    //Getters
     public String getFormat() {
        return format;
    }
    public int getNum_licences() {
        return num_licences;
    }
    public String getFile_format() {
        return file_format;
    }
    public String getUrl_access() {
        return url_access;
    }
    public String getReading_requirements() {
        return reading_requirements;
    }
    public String getDate_available() {
        return date_available;
    }
}

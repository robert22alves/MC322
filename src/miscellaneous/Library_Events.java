package miscellaneous;

public class Library_Events{

    public enum Event{
        LECTURE, WORKSHOP, EXPOSURE
    }

    private String schedule;
    private String place;
    private String date;

    public class Lecture{

        private String speaker;
        private String subject;

        public Lecture(String schedule, String place, String date, String speaker, String subject){
            Library_Events.this.schedule = schedule;
            Library_Events.this.place = place;
            Library_Events.this.date = date;
            this.speaker = speaker;
            this.subject = subject;
        }

        //Getter
        public String getSpeaker() {
            return speaker;
        }

        public String getSubject() {
            return subject;
        }

    }

    public class Workshop{

        private String info_instructor; //informacoes do instrutor
        private String materials; //materiais necessarios

        public Workshop(String schedule, String place, String date, String info_instructor, String materials){
            Library_Events.this.schedule = schedule;
            Library_Events.this.place = place;
            Library_Events.this.date = date;
            this.info_instructor = info_instructor;
            this.materials = materials;
        }

        //Getter
        public String getInfo_instructor() {
            return info_instructor;
        }

        public String getMaterials() {
            return materials;
        }
    }

    public class Exposure {
        private String exhibitors; //expositores
        private String subject; //materiais necessarios

        public Exposure(String schedule, String place, String date, String exhibitors, String subject){
            Library_Events.this.schedule = schedule;
            Library_Events.this.place = place;
            Library_Events.this.date = date;
            this.exhibitors = exhibitors;
            this.subject = subject;
        }

        //Getter
        public String getExhibitors() {
            return exhibitors;
        }

        public String getSubject() {
            return subject;
        }
    }

    // Getter
    public String getSchedule() {
        return schedule;
    }

    public String getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }

}
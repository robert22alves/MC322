package libmembers_pack;

public abstract class Student extends Member {
    private String institute;
    private String course;
    private String integration; //data de integracao

    public Student(String firstname, String surname, int cpf, int id, int total, int borDays, float fine, String institute, String course, String integration) {
        super(firstname, surname, cpf, id, total, borDays, fine);
        this.institute = institute;
        this.course = course;
        this.integration = integration;
    }

    public String getInstitute() {
        return institute;
    }

    public String getCourse() {
        return course;
    }

    public String getIntegration() {
        return integration;
    }


}

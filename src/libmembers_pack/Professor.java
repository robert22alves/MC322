package libmembers_pack;

public class Professor extends Member{
    private String institute;

    public Professor(String firstname, String surname, int cpf, int id, String institute) {
        super(firstname, surname, cpf, id, 7, 30, 0.5f);
        this.institute = institute;
    }

    public String getInstitute() {
        return institute;
    }
}

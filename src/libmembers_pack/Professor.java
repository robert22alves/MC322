package libmembers_pack;

public class Professor extends Member{
    private String institute;

    public Professor(String firstname, String surname, int cpf, int id, String institute) {
        super(firstname, surname, cpf, id, 30, 42);
        this.institute = institute;
    }

    public String getInstitute() {
        return institute;
    }
}

package libmembers_pack;

public class Professor extends Member{
    private String institute;

    public Professor(String firstname, String surname, int cpf, int id, String institute, String contact, String address, String registration_date) {
        super(firstname, surname, cpf, id, 7, 30, 0.5f, contact, address, registration_date);
        this.institute = institute;
    }

    public String getInstitute() {
        return institute;
    }
}

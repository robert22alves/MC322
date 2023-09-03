package libmembers_pack;

public class Staff extends Member{
    public Staff(String firstname, String surname, int cpf, int id, String contact, String address, String registration_date) {
        super(firstname, surname, cpf, id, 4, 20, 0.75f, contact, address, registration_date);
    }
}

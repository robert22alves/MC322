package miscellaneous;

public abstract class Person {
    private int cpf;
    private String firstname;
    private String surname;

    public Person(String firstname, String surname, int cpf) {
        this.firstname = firstname;
        this.surname = surname;
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return firstname + " " + surname;
    }

    @Override 
    public int hashCode() {
        return toString().hashCode();
    } 
}

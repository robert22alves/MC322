package miscellaneous;

import javax.management.monitor.StringMonitor;

public abstract class Person {
    private int cpf;
    private String firstname;
    private String surname;
    private String contact;
    private String address;

    public Person(String firstname, String surname, int cpf, String contact, String address) {
        this.firstname = firstname;
        this.surname = surname;
        this.cpf = cpf;
        this.contact = contact;
        this.address = address;
    }

    public int getCpf() {
        return cpf;
    }

    public String getContact(){
        return contact;
    }

    public String getAontact(){
        return address;
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

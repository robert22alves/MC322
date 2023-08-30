package system;

import dStructure_pack.Hash_AVLtree;
import libmembers_pack.Grad;
import libmembers_pack.Pgrad;
import libmembers_pack.Professor;
import libmembers_pack.Staff;

public class Membership {
    private Hash_AVLtree<Professor> professors;
    private Hash_AVLtree<Grad> graduates;
    private Hash_AVLtree<Pgrad> postgraduates;
    private Hash_AVLtree<Staff> staff;

    public Membership() {
        this.professors = new Hash_AVLtree<>(13);
        this.graduates = new Hash_AVLtree<>(13);
        this.postgraduates = new Hash_AVLtree<>(13);
        this.staff = new Hash_AVLtree<>(13);
    }

    public void addGrad(Grad g) {
        graduates.addData(g);
    }

    public void addPgrad(Pgrad p) {
        postgraduates.addData(p);
    }

    public void addProfessor(Professor p) {
        professors.addData(p);
    }

    public void addStaff(Staff s) {
        staff.addData(s);
    }

    public Grad returnGrad(String name) {
        return graduates.getData(name);
    }

    public Pgrad returnPgrad(String name) {
        return postgraduates.getData(name);
    }

    public Professor returnProfessor(String name) {
        return professors.getData(name);
    }

    public Staff returnStaff(String name) {
        return staff.getData(name);
    }
}

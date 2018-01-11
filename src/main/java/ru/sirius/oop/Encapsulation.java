package ru.sirius.oop;

public class Encapsulation {
    private String name = "Encapsulation";
    private boolean known = false;
    
    public void nameItself() {
        if (known) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println(name);
        }
    }
    
    public void explain(Student student) {
        student.accept(this);
        this.known = true;
    }
    
    // WRONG NON OOP!!!
    public String getName() {
        return name;
    }
    
    public void setKnown(boolean known) {
        this.known = known;
    }
}

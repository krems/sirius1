package ru.sirius.solid;

import ru.sirius.oop.Student;

import java.util.Collection;
import java.util.Map;

public abstract class SingleResponsibility {
    // WRONG! TO MANY REASONS TO CHANGE THE CLASS
    abstract public void countPrinciples();
    
    abstract public void notifyOtherPrinciples();
    
    abstract public Map<Student, Object> collectStudentsPrinciples();
    
    abstract public void savePrinciplesIntoFile();
    
    abstract public void savePrinciplesToDb();
    
    abstract public void sendPrinciplesViaNetwork();
    
    abstract public Collection<Object> parsePrinciplesFromWeb();
}

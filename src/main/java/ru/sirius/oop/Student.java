package ru.sirius.oop;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;

public class Student implements Person {
    private final String name;
    private final Collection<Object> knownInfo = new HashSet<>();
    
    public Student(final String name) {
        this.name = name;
    }
    
    @Override
    public void accept(final Object information) {
        knownInfo.add(information);
    }
    
    @Override
    public void introduceSelf() {
        System.out.println("I'm student " + name);
    }
    
    @Override
    public void shareKnowledge(final Consumer<Object> student) {
        for (final Object info : knownInfo) {
            student.accept(info);
        }
    }
}

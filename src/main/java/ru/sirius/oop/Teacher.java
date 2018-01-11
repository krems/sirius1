package ru.sirius.oop;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;

public class Teacher implements Person {
    private final String name;
    private final String middleName;
    private final Collection<Object> knownInfo = new HashSet<>();
    
    public Teacher(final String name, final String middleName) {
        this.name = name;
        this.middleName = middleName;
    }
    
    @Override
    public void introduceSelf() {
        System.out.println("I'm teacher " + name + " " + middleName);
    }
    
    @Override
    public void shareKnowledge(final Consumer<Object> person) {
        for (final Object info : knownInfo) {
            person.accept(info);
        }
    }
    
    @Override
    public void accept(final Object o) {
        if (!knownInfo.contains(o)) {
            if (isAccurate(o)) {
                knownInfo.add(o);
            }
        }
    }
    
    private boolean isAccurate(final Object o) {
        return true;
    }
}

package ru.sirius.oop;

import java.util.Arrays;
import java.util.List;

public class Inheritance implements MisunderstoodThing {
    
    @Override
    public void complain() {
        System.out.println("OOP doesn't help! It doesn't work!");
    }
    
    @Override
    public List<String> getConcerns() {
        return Arrays.asList("Can't make independent modules",
                "Can't avoid strong coupling",
                "Can't extend existing code well");
    }
}

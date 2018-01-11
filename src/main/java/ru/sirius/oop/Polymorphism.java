package ru.sirius.oop;

import java.util.Collection;
import java.util.HashSet;

public class Polymorphism {
    private Teacher teacher = new Teacher("Valery", "Alekseevich");
    private Collection<Student> clas = new HashSet<Student>() {{
        add(new Student("Vasya"));
        add(new Student("Katya"));
        add(new Student("Nastya"));
        add(new Student("Petya"));
    }};
    
    public void teachAllPeopleHowToLive() {
        Object howToLiveKnowledge = new Object();
        
        Collection<Person> people = new HashSet<>();
        people.add(teacher);
        people.addAll(clas);
        for (final Person person : people) {
            person.accept(howToLiveKnowledge);
        }
    }
}

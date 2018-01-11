package ru.sirius.oop;

import java.util.function.Consumer;

public interface Person extends Consumer<Object> {
    void introduceSelf();
    
    void shareKnowledge(Consumer<Object> person);
}

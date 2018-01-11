package ru.sirius.solid;

public class LiskovSubstitutionPrinciple {}

class Point {
    final int x;
    final int y;
    
    Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        final Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }
}

class ColoredPoint extends Point {
    final String color;
    
    ColoredPoint(final String color, final int x, final int y) {
        super(x, y);
        this.color = color;
    }
}

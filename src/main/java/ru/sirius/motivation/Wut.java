package ru.sirius.motivation;

public class Wut {
    public static double f(int a, int b) {
        double y = b;
        double z = 1;
        while (a > 0) {
            if (a % 2 == 1) {
                z *= y;
            }
            y = Math.pow(y, 2);
            a /= 2;
        }
        return z;
    }
}

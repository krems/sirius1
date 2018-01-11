package ru.sirius.motivation;

public class CleanCode {
    public static double fastPow(double base, int power) {
        double result = 1;
        while (power > 0) {
            if (isOdd(power)) {
                result *= base;
            }
            base = Math.pow(base, 2);
            power /= 2;
        }
        return result;
    }
    
    private static boolean isOdd(final int power) {
        return power % 2 == 1;
    }
}

package ru.sirius.solid;

import ru.sirius.oop.Student;

import java.time.Period;

public class DependencyInversion {
    
    // WRONG! DIFFERENT LEVEL OF ABSTRACTION IN SAME METHOD
    public double getStudentLoanMonthlyPayment(Student debtor, double amount, Period term) {
        int score = calculateScore(debtor);
        double interestRate = Math.exp(-score);
        double yearFraction = term.toTotalMonths() * 30 / 365.25;
        double total = totalPayments(interestRate, amount, yearFraction);
        return total / term.toTotalMonths();
    }
    
    private int calculateScore(final Student debtor) {
        return 600;
    }
    
    private double totalPayments(final double interestRate, final double amount, final double yearFraction) {
        return amount * Math.pow(1 + interestRate * 365.25 / yearFraction, yearFraction);
    }
}

package com.adam.calculators.salarycalculator;

public class CalculationProcessor {

    static final short daysInYear = 252;
    static final short daysInWeek = 5;
    static final short weeksInYear = daysInYear/daysInWeek;
    static final short hoursInDay = 7;

    private int selection = 0;
    double pensionModifier = 0.0d;
    double annualSalary = 0.0d;

    CalculationProcessor(User u, int selection) {
        this.selection = selection;

        if (u.getUserPensionContribution() > 0)
            this.pensionModifier = u.getUserPensionContribution();

        this.annualSalary = u.getUserSalary() - (u.getUserSalary() * (pensionModifier/100));

        if (selection == 0)
            System.out.println(String.format("Hourly wage = £%.5s" ,calculateHourlyWage()));
    }

    private double calculateHourlyWage() {
        return (annualSalary / daysInYear) / hoursInDay;
    }

    private String returnCalculation() {
        return "Example string";
    }




}

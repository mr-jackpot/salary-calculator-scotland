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

        switch (selection) {
            case 0:
                summaryOfRates();
                break;
            case 1:
                System.out.println(calculateHourlyWage());
                break;
            case 2:
                System.out.println(calculateWeeklyWage());
                break;

        }
    }

    private String calculateHourlyWage() {
        return String.format("Hourly wage = £%.5s" ,(annualSalary / daysInYear) / hoursInDay);
    }

    private String calculateWeeklyWage() {
        return String.format("Weekly wage = £%.5s", (annualSalary / weeksInYear));
    }

    private void  summaryOfRates() {
        System.out.println(calculateHourlyWage());
        System.out.println(calculateWeeklyWage());
    }

}

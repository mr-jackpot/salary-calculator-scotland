package com.adam.calculators.salarycalculator;

public class User {

    String name;
    short age;
    double annualSalary;
    double pensionContribution;

    public User (String name, short age, double annualSalary) {
        this.name = name;
        this.age = age;
        this.annualSalary = annualSalary;
        System.out.println(String.format("Name:%s Age:%s Annual Salary:£%s", name, age, annualSalary));
    }

    public User (String name, short age, double annualSalary, double pensionContribution) {
        this(name, age, annualSalary);
        this.pensionContribution = pensionContribution;
        System.out.println(String.format("Pension contribution: %s%%", pensionContribution));


    }



}

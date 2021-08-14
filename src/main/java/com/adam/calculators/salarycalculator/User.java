package com.adam.calculators.salarycalculator;

public class User {

    private String name;
    private short age;
    private double annualSalary;
    private double pensionContribution = 0;

    public User (String name, short age, double annualSalary) {
        this.name = name;
        this.age = age;
        this.annualSalary = annualSalary;
        System.out.println(String.format("Name:%s Age:%s Annual Salary:£%s", name, age, annualSalary));
    }

    public User (String name, short age, double annualSalary, double pensionContribution) {
        this(name, age, annualSalary);
        this.pensionContribution = pensionContribution;
    }

    public String getUserName() {
        return name;
    }

    public short getUserAge() {
        return age;
    }

    public double getUserSalary() {
        return annualSalary;
    }

    public double getUserPensionContribution() {
        return pensionContribution;
    }
}

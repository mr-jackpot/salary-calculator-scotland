package com.adam.calculators.salarycalculator;

public class App {

    public static void main(String[] args) {
        User u = new User("Adam", (short) 22, 100000.0d, 7.0d);
        CalculationProcessor calc = new CalculationProcessor(u, 0);
    }
}

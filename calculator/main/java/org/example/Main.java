package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double a = 10.0;
        double b = 5.0;

        System.out.println("=== Перевірка роботи калькулятора ===");
        System.out.printf("1. Додавання: %.2f + %.2f = %.2f%n", a, b, calc.add(a, b));
        System.out.printf("2. Віднімання: %.2f - %.2f = %.2f%n", a, b, calc.subtract(a, b));
        System.out.printf("3. Множення:  %.2f * %.2f = %.2f%n", a, b, calc.multiply(a, b));

        if (b != 0) {
            System.out.printf("4. Ділення:   %.2f / %.2f = %.2f%n", a, b, calc.divide(a, b));
        } else {
            System.out.println("4. Ділення:   Помилка! Ділення на нуль неможливе.");
        }
    }
}
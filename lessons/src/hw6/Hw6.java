package hw6;

public class Hw6 {
    public static void main(String[] args) {
        double income = 30000;
        double resultTax = calculateTax(income);
        System.out.printf("При доході %.2f, податок: %.2f%n", income, resultTax);
    }

    public static double calculateTax(double income) {
        if (income <= 0) {
            return 0;
        }

        double tax = 0;

        if (income <= 10000) {
            tax += income * 0.025;
            return tax;
        } else {
            tax += 10000 * 0.025;
        }

        if (income <= 25000) {
            tax += (income - 10000) * 0.043;
            return tax;
        } else {
            tax += 15000 * 0.043;
        }

        tax += (income - 25000) * 0.067;

        return tax;
    }
}
package hw14;

public class Triangle implements Calculate {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculate() {
        double p = (a + b + c) / 2.0; // Півпериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Площа за формулою Герона
    }
}
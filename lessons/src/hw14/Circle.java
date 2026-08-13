package hw14;

public class Circle implements Calculate {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }
}
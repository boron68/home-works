package hw14;

public class Square implements Calculate {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculate() {
        return side * side;
    }
}
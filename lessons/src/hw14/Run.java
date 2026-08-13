package hw14;

public class Run {

    public static void main(String[] args) {

        Calculate[] shapes = new Calculate[] {
                new Circle(5),
                new Square(4),
                new Triangle(3, 4, 5)
        };


        double totalArea = getTotalArea(shapes);


        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }


    public static double getTotalArea(Calculate[] shapes) {
        double sum = 0;
        for (Calculate shape : shapes) {
            sum += shape.calculate();
        }
        return sum;
    }
}
package hw8;

public class HW8 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        System.out.print("Початковий масив: [");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 201) - 100;
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("--------------------------------------------------\n");

        int sumNegative = 0;
        int countEven = 0;
        int countOdd = 0;

        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        int firstNegativeIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            if (current < 0) {
                sumNegative += current;
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
            }

            if (current % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            if (current > max) {
                max = current;
                maxIndex = i;
            }
            if (current < min) {
                min = current;
                minIndex = i;
            }
        }

        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних: " + countEven);
        System.out.println("Кількість непарних: " + countOdd);
        System.out.println("Максимальний елемент: " + max + " (індекс: " + maxIndex + ")");
        System.out.println("Мінімальний елемент: " + min + " (індекс: " + minIndex + ")");

        if (firstNegativeIndex == -1) {
            System.out.println("Від'ємних чисел у масиві немає.");
        } else if (firstNegativeIndex == numbers.length - 1) {
            System.out.println("Після першого від'ємного елементів немає.");
        } else {
            int sumAfter = 0;
            int countAfter = 0;

            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                sumAfter += numbers[i];
                countAfter++;
            }

            double average = (double) sumAfter / countAfter;
            System.out.println("Середнє арифметичне після першого від'ємного: " + average);
        }
    }
}
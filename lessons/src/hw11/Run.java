package hw11;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // Створюємо об'єкт класу T1, щоб викликати його нестатичні методи
        T1 t1 = new T1();

        // --- Завдання 1 ---
        int number = 5;
        int sqResult = t1.calSq(number);
        System.out.print("1. Введіть ціле число: " + number + "\n  ");
        t1.printSq(number, sqResult);
        System.out.println();

        // --- Завдання 2 ---
        double radius = 3.5;
        double height = 10.0;
        double volume = t1.calCylinderVolume(radius, height);
        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume);
        System.out.println();

        // --- Завдання 3 ---
        int[] numbers = {10, 20, 30, 40, 50};
        int arraySum = t1.sumArray(numbers);
        System.out.println("3. Масив чисел: " + Arrays.toString(numbers));
        System.out.println("  Сума всіх елементів масиву дорівнює " + arraySum);
        System.out.println();

        // --- Завдання 4 ---
        String textToReverse = "Hello, World!";
        String reversed = t1.reverseString(textToReverse);
        System.out.println("4. Введіть рядок: " + textToReverse);
        System.out.println("  Рядок в зворотньому порядку: " + reversed);
        System.out.println();

        // --- Завдання 5 ---
        int a = 2;
        int b = 3;
        int powResult = t1.power(a, b);
        System.out.println("5. Введіть a: " + a);
        System.out.println("  Введіть b: " + b);
        System.out.println("  Результат " + a + "^" + b + " дорівнює " + powResult);
        System.out.println();

        // --- Завдання 6 ---
        int count = 4;
        String message = "Java програмування";
        System.out.println("6. Введіть ціле число n: " + count);
        System.out.println("  Введіть текстовий рядок: " + message);
        t1.printTextNTimes(count, message);
    }
}
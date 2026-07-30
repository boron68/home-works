package hw11;

import java.util.Arrays;

public class T1 {

    // 1. Квадрат числа
    public int calSq(int n) {
        return n * n;
    }

    public void printSq(int n, int result) {
        System.out.println(String.format("Квадрат числа %d дорівнює %d.", n, result));
    }

    // 2. Об'єм циліндра
    public double calCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // 3. Сума елементів масиву
    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 4. Рядок у зворотному порядку
    public String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // 5. Піднесення a до степеня b (a^b)
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // 6. Друк рядка n разів
    public void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
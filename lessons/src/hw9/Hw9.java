package hw9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw9 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("Відсортований масив: " + Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        int resultIndex = binarySearch(numbers, target);

        if (resultIndex != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + resultIndex);
        } else {
            System.out.println("Число " + target + " відсутнє в масиві.");
        }

        scanner.close();
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
package hw10;

import java.util.Random;

public class Hw10 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        // 1 & 2. Заповнення матриці випадковими числами від 1 до 50
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        // 3. Вивід матриці на екран
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 4. Сума елементів у парних та непарних рядках
        int evenRowsSum = 0; // рядки 0, 2
        int oddRowsSum = 0;  // рядки 1, 3

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0) {
                    evenRowsSum += matrix[i][j];
                } else {
                    oddRowsSum += matrix[i][j];
                }
            }
        }

        // 5. Добуток елементів у парних та непарних стовпцях
        // Використовуємо long, щоб уникнути переповнення int
        long evenColsProduct = 1; // стовпці 0, 2
        long oddColsProduct = 1;  // стовпці 1, 3

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j % 2 == 0) {
                    evenColsProduct *= matrix[i][j];
                } else {
                    oddColsProduct *= matrix[i][j];
                }
            }
        }

        // 6. Вивід результатів обчислень
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + evenRowsSum);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + oddRowsSum);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + evenColsProduct);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + oddColsProduct);
        System.out.println();

        // 7. Перевірка на магічний квадрат
        boolean isMagicSquare = checkMagicSquare(matrix, rows, cols);
        if (isMagicSquare) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }

    private static boolean checkMagicSquare(int[][] matrix, int rows, int cols) {
        int targetSum = 0;
        for (int j = 0; j < cols; j++) {
            targetSum += matrix[0][j];
        }

        // Перевірка рядків
        for (int i = 1; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) return false;
        }

        // Перевірка стовпців
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != targetSum) return false;
        }

        // Перевірка головної діагоналі
        int mainDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != targetSum) return false;

        // Перевірка побічної діагоналі
        int sideDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            sideDiagonalSum += matrix[i][cols - 1 - i];
        }

        return sideDiagonalSum == targetSum;
    }
}
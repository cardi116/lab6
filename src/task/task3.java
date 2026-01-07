package task;
import java.util.Arrays;

class MathOperations {

    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static int findMaxFromArray(int[] numbers) {
        return findMax(numbers);
    }

    public static int findMinFromArray(int[] numbers) {
        return findMin(numbers);
    }

    public static double findAverageFromArray(int[] numbers) {
        return findAverage(numbers);
    }

    public static void displayStatistics(int... numbers) {
        System.out.println("Числа: " + Arrays.toString(numbers));
        System.out.println("Наибольшее значение: " + findMax(numbers));
        System.out.println("Наименьшее значение: " + findMin(numbers));
        System.out.println("Среднее значение: " + String.format("%.2f", findAverage(numbers)));
        System.out.println();
    }

    public static void displayStatisticsFromArray(int[] numbers) {
        displayStatistics(numbers);
    }
}

public class task3 {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ С VARARGS ===");

        System.out.println("\n1. Тест с несколькими числами:");
        MathOperations.displayStatistics(1, 5, 3, 9, 2);

        System.out.println("2. Тест с тремя числами:");
        MathOperations.displayStatistics(10, 20, 30);

        System.out.println("3. Тест с одним числом:");
        MathOperations.displayStatistics(42);

        System.out.println("4. Тест с отрицательными числами:");
        MathOperations.displayStatistics(-5, -1, -10, -3);

        System.out.println("5. Тест со смешанными числами:");
        MathOperations.displayStatistics(-10, 0, 5, 15, -3, 8);

        System.out.println("\n=== ТЕСТИРОВАНИЕ С МАССИВОМ ===");

        int[] numbers1 = {15, 8, 25, 3, 17};
        int[] numbers2 = {100, 50, 75};
        int[] numbers3 = {5};
        int[] numbers4 = {-2, -8, -1, -5};

        System.out.println("\n1. Массив 1: " + Arrays.toString(numbers1));
        System.out.println("   Максимум: " + MathOperations.findMaxFromArray(numbers1));
        System.out.println("   Минимум: " + MathOperations.findMinFromArray(numbers1));
        System.out.println("   Среднее: " + String.format("%.2f", MathOperations.findAverageFromArray(numbers1)));

        System.out.println("\n2. Массив 2: " + Arrays.toString(numbers2));
        System.out.println("   Максимум: " + MathOperations.findMaxFromArray(numbers2));
        System.out.println("   Минимум: " + MathOperations.findMinFromArray(numbers2));
        System.out.println("   Среднее: " + String.format("%.2f", MathOperations.findAverageFromArray(numbers2)));

        System.out.println("\n3. Массив 3: " + Arrays.toString(numbers3));
        System.out.println("   Максимум: " + MathOperations.findMaxFromArray(numbers3));
        System.out.println("   Минимум: " + MathOperations.findMinFromArray(numbers3));
        System.out.println("   Среднее: " + String.format("%.2f", MathOperations.findAverageFromArray(numbers3)));

        System.out.println("\n4. Массив 4: " + Arrays.toString(numbers4));
        System.out.println("   Максимум: " + MathOperations.findMaxFromArray(numbers4));
        System.out.println("   Минимум: " + MathOperations.findMinFromArray(numbers4));
        System.out.println("   Среднее: " + String.format("%.2f", MathOperations.findAverageFromArray(numbers4)));

        System.out.println("\n=== ИСПОЛЬЗОВАНИЕ DISPLAYSTATISTICS С МАССИВОМ ===");
        MathOperations.displayStatisticsFromArray(numbers1);
        MathOperations.displayStatisticsFromArray(numbers2);

        System.out.println("\n=== ТЕСТИРОВАНИЕ ОБРАБОТКИ ИСКЛЮЧЕНИЙ ===");
        try {
            System.out.println("Попытка вызова с пустым varargs:");
            MathOperations.findMax();
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            System.out.println("\nПопытка вызова с пустым массивом:");
            int[] emptyArray = {};
            MathOperations.findMinFromArray(emptyArray);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        System.out.println("\n=== ДЕМОНСТРАЦИЯ СОВМЕСТИМОСТИ VARARGS И МАССИВА ===");
        System.out.println("Можно передать массив в метод с varargs:");
        int[] testArray = {2, 4, 6, 8, 10};
        System.out.println("Результат findMax(testArray): " + MathOperations.findMax(testArray));
        System.out.println("Результат findMin(testArray): " + MathOperations.findMin(testArray));
        System.out.println("Результат findAverage(testArray): " +
                String.format("%.2f", MathOperations.findAverage(testArray)));
    }
}
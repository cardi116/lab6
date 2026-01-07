package task;
import java.util.Arrays;
class ArrayAverage {

    public static double calculateAverage(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static double calculateAverageStream(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        return Arrays.stream(array).average().orElse(0);
    }

    public static void displayArrayInfo(int[] array) {
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        try {
            double average = calculateAverage(array);
            System.out.printf("Среднее значение: %.2f%n", average);

            int sum = Arrays.stream(array).sum();
            System.out.println("Сумма элементов: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
    }
}

public class task8 {
    public static void main(String[] args) {
        System.out.println("Вычисление среднего значения элементов массива:");

        int[] test1 = {1, 2, 3, 4, 5};
        ArrayAverage.displayArrayInfo(test1);

        int[] test2 = {-5, -3, 0, 3, 5};
        ArrayAverage.displayArrayInfo(test2);

        int[] test3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        ArrayAverage.displayArrayInfo(test3);

        int[] test4 = {7, 7, 7, 7, 7};
        ArrayAverage.displayArrayInfo(test4);

        int[] test5 = {42};
        ArrayAverage.displayArrayInfo(test5);

        System.out.println("Сравнение методов расчета среднего:");
        double avg1 = ArrayAverage.calculateAverage(test1);
        double avg2 = ArrayAverage.calculateAverageStream(test1);
        System.out.printf("Метод с циклом: %.2f%n", avg1);
        System.out.printf("Метод со Stream API: %.2f%n", avg2);
        System.out.printf("Результаты совпадают: %b%n", Math.abs(avg1 - avg2) < 0.0001);
    }
}
package task;
import java.util.Arrays;

class ArrayOperations {

    public static int[] getFirstElements(int[] array, int count) {
        if (count <= 0) {
            return new int[0];
        }

        if (count > array.length) {
            count = array.length;
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public static int[] getFirstElementsOptimized(int[] array, int count) {
        if (count <= 0) {
            return new int[0];
        }

        int elementsToCopy = Math.min(count, array.length);
        int[] result = new int[elementsToCopy];

        System.arraycopy(array, 0, result, 0, elementsToCopy);

        return result;
    }
}

public class task6 {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Исходный массив: " + Arrays.toString(testArray));

        int[] testCases = {0, 1, 3, 5, 10, 15};

        for (int count : testCases) {
            int[] result = ArrayOperations.getFirstElements(testArray, count);
            System.out.printf("Первые %d элементов: %s%n",
                    count, Arrays.toString(result));
        }

        System.out.println("\nСравнение с оптимизированной версией:");
        int[] result1 = ArrayOperations.getFirstElements(testArray, 4);
        int[] result2 = ArrayOperations.getFirstElementsOptimized(testArray, 4);
        System.out.println("Версия с циклом: " + Arrays.toString(result1));
        System.out.println("Оптимизированная версия: " + Arrays.toString(result2));
        System.out.println("Результаты идентичны: " + Arrays.equals(result1, result2));
    }
}
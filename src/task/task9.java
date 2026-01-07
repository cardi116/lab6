package task;
import java.util.Arrays;

class ArrayReverser {

    public static void swapPairs(char[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        for (int i = 0; i < array.length / 2; i++) {
            int j = array.length - 1 - i;

            // Меняем местами элементы
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static char[] getReversedArray(char[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        char[] reversed = array.clone();
        swapPairs(reversed);
        return reversed;
    }

    public static void demonstrateSwap(char[] array) {
        System.out.println("Исходный массив: " + Arrays.toString(array));

        char[] copy1 = array.clone();
        char[] copy2 = array.clone();

        swapPairs(copy1);
        System.out.println("После swapPairs: " + Arrays.toString(copy1));

        char[] reversed = getReversedArray(copy2);
        System.out.println("После getReversedArray: " + Arrays.toString(reversed));

        System.out.println("Исходный массив (не изменился): " + Arrays.toString(array));
        System.out.println();
    }
}

public class task9 {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ МЕТОДА ДЛЯ ПОПАРНОЙ ПЕРЕСТАНОВКИ ===");

        System.out.println("\n1. Массив четной длины:");
        char[] test1 = {'A', 'B', 'C', 'D', 'E', 'F'};
        ArrayReverser.demonstrateSwap(test1);

        System.out.println("2. Массив нечетной длины:");
        char[] test2 = {'1', '2', '3', '4', '5'};
        ArrayReverser.demonstrateSwap(test2);

        System.out.println("3. Массив с одним элементом:");
        char[] test3 = {'X'};
        ArrayReverser.demonstrateSwap(test3);

        System.out.println("4. Пустой массив:");
        char[] test4 = {};
        ArrayReverser.demonstrateSwap(test4);

        System.out.println("5. Массив с русскими буквами:");
        char[] test5 = {'П', 'р', 'и', 'в', 'е', 'т'};
        ArrayReverser.demonstrateSwap(test5);

        System.out.println("6. Большой массив:");
        char[] test6 = new char[10];
        for (int i = 0; i < test6.length; i++) {
            test6[i] = (char) ('a' + i);
        }
        ArrayReverser.demonstrateSwap(test6);

        System.out.println("=== ПОШАГОВАЯ ДЕМОНСТРАЦИЯ ===");
        char[] demoArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("\nИсходный массив: " + Arrays.toString(demoArray));

        for (int i = 0; i < demoArray.length / 2; i++) {
            int j = demoArray.length - 1 - i;
            System.out.printf("Шаг %d: меняем местами array[%d]='%c' и array[%d]='%c'%n",
                    i + 1, i, demoArray[i], j, demoArray[j]);

            char temp = demoArray[i];
            demoArray[i] = demoArray[j];
            demoArray[j] = temp;

            System.out.println("  Текущее состояние: " + Arrays.toString(demoArray));
        }

        System.out.println("\nФинальный результат: " + Arrays.toString(demoArray));

        System.out.println("\n=== ТЕСТИРОВАНИЕ ОБРАБОТКИ ИСКЛЮЧЕНИЙ ===");
        try {
            ArrayReverser.swapPairs(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}
package task;
class DoubleFactorial {

    public static long calculateDoubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }

        long result = 1;
        int current = n;

        while (current > 0) {
            result *= current;
            current -= 2;
        }

        return result;
    }

    public static long calculateDoubleFactorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        if (n <= 1) {
            return 1;
        }
        return n * calculateDoubleFactorialRecursive(n - 2);
    }
}

public class task4 {
    public static void main(String[] args) {
        System.out.println("Вычисление двойного факториала:");

        int[] testNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int n : testNumbers) {
            long result = DoubleFactorial.calculateDoubleFactorial(n);
            System.out.printf("%d!! = %d%n", n, result);
        }

        System.out.println("\nПроверка рекурсивной версии:");
        System.out.println("8!! = " + DoubleFactorial.calculateDoubleFactorialRecursive(8));
        System.out.println("9!! = " + DoubleFactorial.calculateDoubleFactorialRecursive(9));

        System.out.println("\nПроверка примеров из задания:");
        System.out.println("6!! должно быть 48: " + DoubleFactorial.calculateDoubleFactorial(6));
        System.out.println("5!! должно быть 15: " + DoubleFactorial.calculateDoubleFactorial(5));
    }
}
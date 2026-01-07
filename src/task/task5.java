package task;

class SumOfSquares {

    public static long sumOfSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом");
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static long sumOfSquaresFormula(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом");
        }

        return (long) n * (n + 1) * (2L * n + 1) / 6;
    }

    public static void compareMethods(int n) {
        long loopResult = sumOfSquares(n);
        long formulaResult = sumOfSquaresFormula(n);

        System.out.printf("n = %d%n", n);
        System.out.printf("Цикл: 1² + 2² + ... + %d² = %d%n", n, loopResult);
        System.out.printf("Формула: n(n+1)(2n+1)/6 = %d%n", formulaResult);
        System.out.printf("Результаты совпадают: %b%n%n", loopResult == formulaResult);
    }
}

public class task5 {
    public static void main(String[] args) {
        System.out.println("Вычисление суммы квадратов натуральных чисел:");

        for (int n = 1; n <= 10; n++) {
            SumOfSquares.compareMethods(n);
        }

        int[] largeNumbers = {50, 100, 1000};
        for (int n : largeNumbers) {
            System.out.printf("Сумма квадратов для n = %d: %,d%n",
                    n, SumOfSquares.sumOfSquaresFormula(n));
        }
    }
}
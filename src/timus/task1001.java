package timus;

import java.util.Scanner;

public class task1001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long sum = 0;
        int count = 0;

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();

            sum += number;
            count++;
        }

        System.out.println("Всего чисел считано: " + count);
        System.out.println("Сумма всех чисел: " + sum);

        scanner.close();
    }
}

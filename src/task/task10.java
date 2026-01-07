package task;
import java.util.Arrays;

public class task10 {

    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] data = {50, 10, 5, 99, 25};
        int[] result = findMinMax(data);
        System.out.println("Исходные данные: " + Arrays.toString(data));
        System.out.println("Результат [Max, Min]: " + Arrays.toString(result));

        int[] resultVarargs = findMinMax(1, 100, -5, 42);
        System.out.println("Результат Varargs [Max, Min]: " + Arrays.toString(resultVarargs));

        int[] emptyResult = findMinMax();
        System.out.println("Результат для пустого набора: " + Arrays.toString(emptyResult));
    }
}
package task;
class CharToCodeConverter {

    public static int[] convertToCharCodes(char[] charArray) {
        if (charArray == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        int[] codeArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            codeArray[i] = charArray[i];
        }

        return codeArray;
    }

    public static void displayConversion(char[] charArray) {
        int[] codes = convertToCharCodes(charArray);

        System.out.print("Символы: [");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
            if (i < charArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Коды: [");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]);
            if (i < codes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Шестнадцатеричные коды: [");
        for (int i = 0; i < codes.length; i++) {
            System.out.printf("0x%04X", codes[i]);
            if (i < codes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
    }
}

public class task7 {
    public static void main(String[] args) {
        System.out.println("Преобразование символьного массива в массив кодов:");

        char[] test1 = {'A', 'B', 'C', 'D', 'E'};
        CharToCodeConverter.displayConversion(test1);

        char[] test2 = {'П', 'р', 'и', 'в', 'е', 'т'};
        CharToCodeConverter.displayConversion(test2);

        char[] test3 = {'1', '2', '3', '!', '?', '@'};
        CharToCodeConverter.displayConversion(test3);

        char[] test4 = {};
        CharToCodeConverter.displayConversion(test4);

        char[] test5 = {' ', '\n', '\t', '\'', '"'};
        CharToCodeConverter.displayConversion(test5);
    }
}
package task;
class AssignmentClass {
    private char charField;
    private String textField;

    public void assignValue(char value) {
        this.charField = value;
        System.out.println("Установлен символьный аргумент: " + value);
    }

    public void assignValue(String value) {
        this.textField = value;
        System.out.println("Установлен текстовый аргумент: " + value);
    }

    public void assignValue(char[] chars) {
        if (chars.length == 1) {
            this.charField = chars[0];
            System.out.println("Установлен символьный аргумент из массива: " + chars[0]);
        } else {
            this.textField = new String(chars);
            System.out.println("Установлен текстовый аргумент из массива: " + this.textField);
        }
    }

    public void displayValues() {
        System.out.println("Символьное поле: " + charField);
        System.out.println("Текстовое поле: " + (textField != null ? textField : "не установлено"));
    }
}

public class task1 {
    public static void main(String[] args) {
        AssignmentClass obj = new AssignmentClass();

        obj.assignValue('A');
        obj.displayValues();

        obj.assignValue("Привет, мир!");
        obj.displayValues();

        char[] singleChar = {'B'};
        obj.assignValue(singleChar);
        obj.displayValues();

        char[] multipleChars = {'H', 'e', 'l', 'l', 'o'};
        obj.assignValue(multipleChars);
        obj.displayValues();
    }
}
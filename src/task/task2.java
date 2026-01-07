package task;

class StaticCounter {
    private static int counter = 0;

    public static void displayAndIncrement() {
        System.out.println("Текущее значение счетчика: " + counter);
        counter++;
    }

    public static int getCurrentValue() {
        return counter;
    }

    public static void resetCounter() {
        counter = 0;
        System.out.println("Счетчик сброшен в 0");
    }
}

public class task2 {
    public static void main(String[] args) {
        System.out.println("Начальное значение: " + StaticCounter.getCurrentValue());

        for (int i = 0; i < 5; i++) {
            StaticCounter.displayAndIncrement();
        }

        System.out.println("Финальное значение: " + StaticCounter.getCurrentValue());

        StaticCounter.resetCounter();

        System.out.println("\nПосле сброса:");
        for (int i = 0; i < 3; i++) {
            StaticCounter.displayAndIncrement();
        }
    }
}
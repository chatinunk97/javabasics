package generics;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = { "String1", "String2", "String3" };
        Double[] doubleArray = { 1.222, 30.4223, 1012039.1231 };

        displayArray(stringArray);
        displayArray(doubleArray);

        System.out.println(getFirst(stringArray));
        System.out.println(getFirst(doubleArray));
    }

    public static <T> void displayArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static <T> T getFirst(T[] array) {
        return array[0];

    }
}

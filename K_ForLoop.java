import java.util.Scanner;

public class K_ForLoop {
    public static void main(String[] args) {
        // String[] testArray = { "A", "B", "WOW" };
        // for (int i = 0; i < testArray.length; i++) {
        // for (int y = 0; y < testArray.length; y++) {
        // System.out.println(y + " --- " + i);
        // }
        // }
        int rows;
        int columns;
        String symbol = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter # of rows : ");
        rows = scanner.nextInt();

        System.out.println("Enter # of columns : ");
        columns = scanner.nextInt();

        System.out.println("Enter your symbol choice : ");
        symbol = scanner.next();

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int y = 0; y < columns; y++) {
                System.out.print(symbol);
            }

        }

    }
}

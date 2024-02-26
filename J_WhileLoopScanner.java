import java.util.Scanner;

public class J_WhileLoopScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // isBlank : checks if the string has only "whiespace" or not
        // isEmpty : checks if the .length() == 0
        while (name.isBlank()) {
            System.out.println(name.length());
            System.out.print("Entr your name : ");
            name = scanner.nextLine();
        }
        scanner.close();
        System.out.println(name);
    }
}

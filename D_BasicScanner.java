import java.util.Scanner;

public class D_BasicScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scanner.nextLine();

        System.out.println("What is your age ?");
        int age = scanner.nextInt();

        /*This is to clear our scanner
        Because nextInt only reads the integer but we always press enter everytime we submit something
        That making the next nextLine for variable food start from \n which the way nextLine reads input it that 
        It reads until it finds the \n but in this case it's already there at the beginning making us not able to get a change to type in our fav food
        */
        scanner.nextLine();

        System.out.println("What is your fav food ?");
        String food = scanner.nextLine();

        System.out.println("Hwllo " + name + " and you're " + age + " and your fav food is " + food);
    }
}

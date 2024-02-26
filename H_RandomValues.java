import java.util.Random;
import java.util.Scanner;

public class H_RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

        // Pseudo Random (not that random)

        // Computr starts at 0 so it will random from 0 to bound -1
        int x = random.nextInt(6 + 1);
        System.out.println(x);

        // Double random is 0 - 1
        double y = random.nextDouble();
        System.out.println(y);

        // Boolean
        boolean z = random.nextBoolean();
        System.out.println(z);

        // Take in a limit number and random a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a limiter ::");
        int limiter = scanner.nextInt();

        do {
            if (limiter > 1) {
                break;
            } else {
                System.out.print("Please enter a whole number more than 0 ::");
                limiter = scanner.nextInt();
            }
        } while (true);

        int randomNumber = random.nextInt(limiter);
        System.out.println(randomNumber);

        scanner.close();
    }
}

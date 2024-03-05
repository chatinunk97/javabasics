import java.util.InputMismatchException;
import java.util.Scanner;

public class V_TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide : ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by : ");
            int y = scanner.nextInt();

            double z = (double) x / (double) y;
            System.out.println("Result =  " + z);

        }
        // It's is a good practice to catch every case that is possible
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("You cann't devide by zero bro");
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Please enter a number bro !!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Something went wrong");
        } finally {
            scanner.close();
            System.out.println("This will always print FINALLY");
        }

    }
}

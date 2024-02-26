import java.util.Scanner;

public interface G_MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;
        double z = 144;

        // Max method
        System.out.println("Max number is : " + Math.max(x, y));
        // Absolute
        System.out.println("Absolute value of -10 is : " + Math.abs(y));
        // Square Root
        System.out.println("The square root of 144 is : " + Math.abs(z));
        // Ceil Floor
        System.out.println("Ceil of 3.14 is : " + Math.ceil(x));
        System.out.println("Floor of 3.14 is : " + Math.floor(x));

        // Finding the Hypotenuse
        double a = 0;
        double b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter side a length : ");
        a = scanner.nextDouble();

        System.out.print("Please enter side b length : ");
        b = scanner.nextDouble();

        System.out.println("The hypotenuse is : " + Math.sqrt((a * a) + (b * b)));

        scanner.close();
    }
}

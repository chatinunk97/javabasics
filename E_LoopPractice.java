import java.util.Scanner;

public class E_LoopPractice {
    public static void main(String[] args) {
        System.out.println("Test E_Calculator~");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        String[] setOfString = { "1AAA", "2BBB" };
        for (String string : setOfString) {
            System.out.println(string);
        }

        int counter = 0;
        while (counter < 2) {
            System.out.println("This is couter ==> " + counter);
            counter++;
        }

        int doWhileCounter = 9;
        do {
            System.out.println("Eventho the condition is x < 9 it still runs atleast one time ==>" + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter < 9);

        // Let's try asking for a an input until the user inputs the correct value

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Give me a positive number :: ");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("You have successfully input a positive number : => " + number);
                double testNumber = Math.sqrt(number);
                System.out.println(testNumber);
                break;
            }
            // } while (number < 0);
        } while (true); // This is more common than above line do "while(true)" then condition a break
                        // inside the loop

    }
}

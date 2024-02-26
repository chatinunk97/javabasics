import java.util.Scanner;

import javax.swing.JOptionPane;

public class I_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Please enter your name");
        // String name = scanner.nextLine();

        String name = JOptionPane.showInputDialog("Enter your name");

        switch (name) {
            case "Boss":
                JOptionPane.showMessageDialog(null, "Hi admin !");
                System.out.println("Hello Admin");
                break;

            default:
                System.out.println("Hello user \"" + name + " Welcome !");
                break;
        }
        scanner.close();
    }

}

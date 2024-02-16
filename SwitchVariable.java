public class SwitchVariable {
    public static void main(String[] args) {
        char myChar = 'A';
        char myChar2 = 'B';
        char myTempChar;

        // Begin switching 2 variable's value
        myTempChar = myChar;
        myChar = myChar2;
        myChar2 = myTempChar;

        System.out.println("The value for myChar is " + myChar + "\nThe value for myChar 2 is " + myChar2);

    }
}

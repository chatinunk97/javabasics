public class P_PrintF {
    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '%';
        String myString = "STRING";

        System.out.printf("%b <<<<< This is th boolean", myBoolean);
        System.out.println();
        System.out.printf("%s <<<<< This is th String", myString);
        System.out.println();
        System.out.printf("%c <<<<< This is th Character", myChar);
        System.out.println();

        // We can adjust the width of the String
        System.out.printf("Testing the width adjuster %10s <<<<", myString);
        // adjusting decimals
        System.out.printf("You have money %.2f", 10.235092);
    }
}

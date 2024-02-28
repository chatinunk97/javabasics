public class O_Method {
    public static void main(String[] args) {
        hello("ARGS !!", 100);
        int result = add(100, 50);
        System.out.println(result);

        System.out.println(add(100, 200, 300));
    }

    // Make this method static to give access to the method directly
    // With out have to instanciate O_Method class
    static void hello(String arg, int integer) {
        System.out.println("Hello from  hello Method " + arg + integer);
    }

    // Normally we type void = no return value
    static int add(int numberA, int numberB) {
        return numberA + numberB;

    }

    // Overload methods
    // Method with the same name but dif parameters
    static int add(int numberA, int numberB, int numberC) {
        System.out.println("This is a overloaded method #2 3 args");
        return numberA + numberB + numberC;
    }
}

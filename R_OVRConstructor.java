public class R_OVRConstructor {
    // Overloaded Constructors
    String bread;
    String sauce;
    String cheese;
    String topping;

    // Constructor #1 : 4 parameters
    R_OVRConstructor(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    // Constructor #2 : 3 parameters
    R_OVRConstructor(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    // Constructor #3 : 1 parameter
    R_OVRConstructor(String bread) {
        this.bread = bread;
    }
}

public class U_Abstract {
    public static void main(String[] args) {
        // Abstract class : think it this way it's to general so you can't instantiate
        // it
        // Let's say you want a car but you say sth like give me a Vehicle it's too
        // general

        CarAbstract car = new CarAbstract();
        car.go();
    }
}

// It's not a must to name it like this I'm just avoiding the duplicate of other
// files
abstract class VehicleAbstract {
    // abstract Body is not allow in an abstract method
    abstract void go();

    // normal method can have a body
    void testMethod() {
        System.out.println("test?");
    }
}

class CarAbstract extends VehicleAbstract {

    @Override
    void go() {
        System.out.println("Go method in CarAbstract ");
    }
}
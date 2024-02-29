public class U_Inheritance {
    // Where a class require methods , attributes of another
    public static void main(String[] args) {
        CarTest car = new CarTest(100.1123);
        car.go();
        System.out.println(car.speed);
        System.out.println(car.toString());
    }
}

// The child class
class CarTest extends Vehicle {
    int wheels = 4;

    CarTest(double speed) {
        super(speed);
    }

    @Override
    void go() {
        System.out.println("This go is the override");
    }

    public String toString() {
        return super.toString() + " and this part is the child toString()" + super.speedTest;
    }
}

// The super class
class Vehicle {
    double speed;
    double speedTest = 100;

    Vehicle(double speed) {
        this.speed = speed;
    }

    void go() {
        System.out.println("This vehicle is moving");
    }

    void stop() {
        System.out.println("This vehicle has stopped");
    }

    public String toString() {
        return "This is the super class toString()";
    }
}

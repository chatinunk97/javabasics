package polymorth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        // Polymorphism is that an object can identify as more than one type
        // Ploy = Many , Morph = form,shape
        Vehicle[] racers = { car, boat, bike };

        for (Vehicle vehicle : racers) {
            vehicle.go();
        }

        // Dynamic Polymorphism
        // Dynamic = after compilation
        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want ");
        System.out.print("1 = dog or 2 = cat : ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid");
        }
        scanner.close();
    }

}

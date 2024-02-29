public class S_toString {
    // Every objects has this toString() method
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.color);

        // Printing out the obj directly will only give us the addrss of the memory
        System.out.println(myCar);

        // Normally people overwrite the toString method
        System.out.println(myCar.toString());

        // You may ask why don't we just come up with another method name ?
        // This is becaus when you're printing an obj it's refering to the toString()
        // So after overriding the method you can use it implicitly (printLn(obj))
    }
}

class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    // this method is handy when there's a local variable inside
    // by using 'this' it will point to the object's attribute
    public String toString() {
        String make = "new Ford";
        String myString = this.make + "-" + model + "-" + color + "-" + year;
        return myString;
    }
}
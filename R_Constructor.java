public class R_Constructor {

    String name;
    int age;
    double weight;

    R_Constructor(String name, int age, double weight) {
        // Use 'this' to refer to the class attribute
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(this.name + " is eating !");
    }

    public void drink() {
        System.out.println(this.name + " is drinking ...");
    }

}

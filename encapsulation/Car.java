package encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor method
    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    // public String toString() {
    //     return this.make + " -- " + this.model + " -- " + this.year;
    // }

    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;

    }

    public int getYear() {
        return this.year;

    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

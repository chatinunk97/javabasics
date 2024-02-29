import java.util.ArrayList;

public class T_ArrayOBJ {
    public static void main(String[] args) {

        Food[] myFood = { new Food("Pizza", 100), new Food("Sushi", 150) };
        System.out.println(myFood[0].name + " price => " + myFood[0].price);

        Plate myPlate = new Plate();
        Food burger = new Food("Burger", 150);
        myPlate.placeFood(burger);
        myPlate.placeFood(burger);
        myPlate.placeFood(burger);

        myPlate.checkFood();
        myPlate.checkPrice();

        Plate.displayFoodCount();
    }
}

class Food {
    String name;
    int price;

    Food(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Plate {
    ArrayList<Food> myFood = new ArrayList<>();
    static int foodCout;

    static void displayFoodCount() {
        System.out.println(foodCout);
    }

    void placeFood(Food food) {
        myFood.add(food);
        foodCout++;
    }

    void checkFood() {
        for (Food food : myFood) {
            System.out.println(food.name);
        }
    }

    void checkPrice() {
        int price = 0;
        for (Food food : myFood) {
            price += food.price;
        }
        System.out.println("Your total payment is : " + price);
    }
}
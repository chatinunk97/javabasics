import java.util.*;

public class N_ArrayList {
    public static void main(String[] args) {
        // Resizeable Array store only ref data type
        // If you want to store Primitive data type use its Wrapper class instead

        ArrayList<String> food = new ArrayList<String>();

        food.add("Burger");
        food.add("Pizza");
        food.add("Hotdog");

        food.set(0, "New Food !!");
        food.remove(2);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        // food.clear();
        // for (int i = 0; i < food.size(); i++) {
        // System.out.println(food.get(i));
        // }
        System.out.println("_____");

        // 2D ArrayList
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("Pepsi");
        drinks.add("Pepsi");

        // You can't set a new index it's only for replacement
        drinks.set(1, "CocaCola");

        ArrayList<ArrayList<String>> dinner = new ArrayList<>();
        dinner.add(food);
        dinner.add(drinks);
        System.out.println(dinner);
        System.out.println(dinner.get(0).get(1));

        // For Each Loop
        for (String element : dinner.get(0)) {
            System.out.println("This is for each ==> " + element);
        }
    }

}

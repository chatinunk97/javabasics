public class R_OOP {
    public static void main(String[] args) {
        // Check R_Constructor file for the class detail
        R_Constructor human1 = new R_Constructor("Boss", 10, 100);
        System.out.println(human1.name);

        R_Constructor human2 = new R_Constructor("MM", 25, 15);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();
        new R_DiceRoller();

        R_OVRConstructor fullPizza = new R_OVRConstructor("thic", "tomato", "american", "peporoni");
        System.out.println(fullPizza.bread);
        System.out.println(fullPizza.sauce);

        R_OVRConstructor cheapPizza = new R_OVRConstructor("thic");
        System.out.println(cheapPizza.bread);
        System.out.println(cheapPizza.sauce);
    }
}

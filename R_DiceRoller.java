import java.util.Random;

public class R_DiceRoller {

    // You can declare the stuff globally
    // Random random = new Random();
    // int number = 0;
    R_DiceRoller() {
        Random random = new Random();
        int number = 0;
        // OR Pass in the necessary stuff for roll method
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
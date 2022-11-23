package libraries.random;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(6) + 1;
        System.out.println("Random number: " + number);

    }
}



package libraries.random;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random rnd1 = new Random(1L);
        Random rnd2 = new Random(1L);
        boolean test = rnd1.nextInt(6) == rnd2.nextInt(6);
        System.out.println("Test: " + test);
    }
}

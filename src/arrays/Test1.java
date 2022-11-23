package arrays;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        int[] arrayInt = new int[10];

        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100);
            System.out.println(arrayInt[i]);
        }
    }
}


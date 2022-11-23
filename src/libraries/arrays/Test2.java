package libraries.arrays;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        System.out.println("перед сортировкой");

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        Arrays.sort(numbers);

        System.out.println();
        System.out.println("после сортировки");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

//        перед сортировкой
//        75 99 25 54 18 0 70 26 80 60
//        после сортировки
//        0 18 25 26 54 60 70 75 80 99

    }
}


package libraries.arrays;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] numbers = {10, 222, 39};
        int[] numbers2 = {10, 222, 39};

        System.out.println(numbers.equals(numbers2));
        //        false
        System.out.println(Arrays.equals(numbers, numbers2));
        //        true
    }
}


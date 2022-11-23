package libraries.arrays;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {

        int[] numbers = {223, -7, 12, 26, 88, 49, 33, -776, 87, 21};

        int [] numbersCopy = Arrays.copyOfRange(numbers, 5, 8);

        System.out.println(Arrays.toString(numbersCopy));
        // [49, 33, -776]

    }
}


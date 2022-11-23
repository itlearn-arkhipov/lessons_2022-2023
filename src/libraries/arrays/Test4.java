package libraries.arrays;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        int[] numbers = {223, -7, 12, 26, 88, 49, 33, -776, 87, 21};

        int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);

        //вариант 1
        System.out.print("[");
        for(int i = 0; i < numbersCopy.length; i ++){
           String str = (i == numbersCopy.length - 1) ? "" : ", ";
            System.out.print(numbersCopy[i] + str);
        }
        System.out.println("]");
        // [223, -7, 12, 26, 88, 49, 33, -776, 87, 21]

        //вариант 2
        System.out.println(Arrays.toString(numbersCopy));

        // [223, -7, 12, 26, 88, 49, 33, -776, 87, 21]

    }
}


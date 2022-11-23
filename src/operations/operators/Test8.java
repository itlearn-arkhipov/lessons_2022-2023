package operations.operators;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int y = in.nextInt();

        // Тернарный оператор - условная операция
        String result = y > 10 ? "y > 10" : "y <= 10";

        System.out.println(result);

        String result2;
        if (y > 10) {
            result2 = "y > 10";
        } else {
            result2 = "y <= 10";
        }
        System.out.println(result2);
    }
}


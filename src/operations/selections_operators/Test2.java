package operations.selections_operators;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (x > 0) {
            System.out.println("x > 0");
        } else {
            System.out.println("x = " + x);
        }
    }
}


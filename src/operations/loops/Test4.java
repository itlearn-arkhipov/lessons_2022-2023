package operations.loops;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int size = in.nextInt();

        while (count < size) {
            System.out.println("while | count < 10, count = " + count);
            count++;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("for | count < 10, count = " + i);
        }
    }
}


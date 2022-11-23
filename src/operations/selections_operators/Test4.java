package operations.selections_operators;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (x > 0){
            System.out.println("x > 0");
            if(x > 10){
                System.out.println("x > 10");
            } else {
                System.out.println("x > 0 и x <= 10");
            }
        } else if (x == 0){
            System.out.println("x = 0");
        } else {
            System.out.println("x < 0");
        }
    }
}


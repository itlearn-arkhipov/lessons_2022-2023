package string;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();

        if (str1.contains("Привет")) {
            System.out.println("Строка содержит +");
        } else {
            System.out.println("Строка не содержит +");
        }

    }
}


package string;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // Сравнение строк
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = "Привет";

        boolean result = str1.equals(str2);

        System.out.println(result);
    }
}


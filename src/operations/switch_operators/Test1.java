package operations.switch_operators;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String day = in.nextLine();

        switch (day) {
            case "Понедельник":
                System.out.println("Понедельник");
                break;
            case "Вторник":
                System.out.println("Вторник");
                break;
            case "Среда":
                System.out.println("Среда");
                break;
            default:
                System.out.println("Что-то не то");
        }
    }
}


package operations.loops;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Здравствуйте, " +
                    "введите Enter для запуска программы " +
                    "или q для выхода?");

            if (!("q".equals(in.nextLine()))) {
                System.out.println("Здравствуйте, введите свое имя?");
                String name = in.nextLine();
                System.out.println("Здравствуйте " + name);
            } else {
                break;
            }
        }
        System.out.println("Конец");
    }
}



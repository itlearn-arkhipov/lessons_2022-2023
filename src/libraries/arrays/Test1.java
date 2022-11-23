package libraries.arrays;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        System.out.println("перед сортировкой");

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
           /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами*/
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

        System.out.println();
        System.out.println("после сортировки");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        //        перед сортировкой
        //        82 64 6 6 87 43 56 37 35 87
        //        после сортировки
        //        6 6 35 37 43 56 64 82 87 87
    }
}

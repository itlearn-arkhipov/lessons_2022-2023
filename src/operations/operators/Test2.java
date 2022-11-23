package operations.operators;

public class Test2 {
    public static void main(String[] args) {
        int y = 5, y1, y2, y3, y4, y5;
        // Сложение
        y1 = y +11;
        System.out.println("y1 = " + y1); // y1 = 16

        // Вычитание
        y2 = y - 4;
        System.out.println("y2 = " + y2); // y2 = 1

        // Умножение
        y3 = y2 * y;
        System.out.println("y3 = " + y3); // y3 = 5

        // Деление (при делении целых чисел
        // дробная часть отбрасывается)
        y4 = y/3;
        System.out.println("y4 = " + y4); // y4 = 1

        // Деление с остатком
        y5 = y%3 ;
        System.out.println("y5 = " + y5);  // y5 = 2
    }
}



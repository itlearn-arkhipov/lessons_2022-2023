package operations.operators;

public class Test1 {
    public static void main(String[] args) {
        // унарный минус и унарный плюс
        int x = 7, y, z;
        System.out.println("x = " + x); // k = 7
        y= -x;
        System.out.println("y = " + y); // j = -7
        z = +x;
        System.out.println("z = " + z); // k = 7
        // побитовое дополнение
        int i = 15; // двоичное представление i
                    // i = 00000000 00000000 00000000 00001111

        int j;
        j = ~i;     // двоичное представление j
                    // j = 11111111 11111111 11111111 11110000
        System.out.println("z = " + j); // -16

       // операции инкремента и декремента
        int a1 = 1, a2 =1, b, c;
        b = ++a1; // префиксный инкремент
        System.out.println("b = " + b); // 2
        System.out.println("a1 = " + a1); // 2
        c = a2++; // постфиксный инкремент
        System.out.println("c = " + c); // 1
        System.out.println("a2 = " + a2); // 2

    }
}



